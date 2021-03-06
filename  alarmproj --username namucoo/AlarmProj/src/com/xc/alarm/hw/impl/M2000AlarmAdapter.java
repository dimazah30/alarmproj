package com.xc.alarm.hw.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jdom.Element;
import org.omg.CORBA.ORB;
import org.omg.CORBA.StringHolder;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import AlarmIRPSystem.AlarmIRP;
import EPIRPSystem.EPIRP;
import EPIRPSystem.EPIRPHelper;
import EPIRPSystem.IRPElement;

import com.cattsoft.common.EventSource;
import com.cattsoft.common.InmsEvent;
import com.cattsoft.common.InmsEventListener;
import com.cattsoft.common.alarm.NMAlarm;
import com.cattsoft.utility.log.LoggerFactory;


public class M2000AlarmAdapter extends Thread implements EventSource {

	
	  private static Logger logger = LoggerFactory.getLogger(M2000AlarmAdapter.class.getName());
//	  private boolean isNeedSendClearAlarm;
//	  private boolean isNeedSendNewAlarm = true;
//	  private boolean isSynAlarm;
	  private InmsEventListener listener;
	  private boolean endCollect;
	  private Map neMap;
	  public org.omg.CORBA.ORB orb;
	  private Element parameter;
	  POA rootPOA;
		private static String alarmIORFile;
		public static AlarmIRP alarmIRPImpl;
		
	public void run() {
		// TODO Auto-generated method stub
		try {
			collect();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void collect(){
		String systemDN = null;
		String alarmVersion = null;
		String alaemIRPId = null;
		String notificationIRPVersion = null;
		String notificationIRPId = null;
		try {
			String[] args = new String[0];
			ORB orb = ORB.init(args, null);
			alarmIORFile = this.parameter.getChildTextTrim("EmsIor");
			String strConnectHWIOR = "";
			strConnectHWIOR = getlocalIOR(alarmIORFile);
			if (!(strConnectHWIOR != null && strConnectHWIOR.trim().length() > 0)) {
				logger.error("Can't get Ior File");
			}else{
				EPIRP root = EPIRPHelper.narrow(orb
						.string_to_object(strConnectHWIOR));
				String version = root.get_EP_IRP_versions()[0];
				logger.debug(version);
				//获取管理域控制对象概述信息
				EPIRPSystem.SupportedIRPListTypeHolder supportedIRPList = new EPIRPSystem.SupportedIRPListTypeHolder();
				root.get_IRP_outline("", supportedIRPList);
				EPIRPSystem.SupportedIRPListTypeElement elementlist = supportedIRPList.value[0];
				logger.debug(supportedIRPList);
				
				systemDN = elementlist.systemDN;
				IRPElement[] irpElements = elementlist.irpList;
				for(int i=0;i<irpElements.length;i++){
					IRPElement oIRPElement = irpElements[i];
					String irpId = oIRPElement.irpId;
					String irpVersions = oIRPElement.irpVersions[0];
					logger.debug("Version : "+ irpVersions);
					if(irpVersions.indexOf("Alarm")>-1){
						alarmVersion = irpVersions;
						alaemIRPId = irpId;
				
					}
					if(irpVersions.indexOf("Notification") > -1){
						notificationIRPVersion = irpVersions;
						notificationIRPId = irpId;
					}
					
				}
				//获取当前所有alarm
				//获取管理域控制对象引用
				org.omg.CORBA.StringHolder iRPReference = new StringHolder("");
				root.get_IRP_reference("zjpii-gp", systemDN, alaemIRPId, iRPReference);
				System.out.println(iRPReference.value);
				AlarmIRP alarmRoot = AlarmIRPSystem.AlarmIRPHelper.narrow(orb
						.string_to_object(iRPReference.value));
				alarmVersion = alarmRoot.get_alarm_IRP_versions()[0];
				System.out.println(alarmVersion);
				ManagedGenericIRPConstDefs.Method[] melist = alarmRoot.get_alarm_IRP_operations_profile(alarmVersion);
				for (int i = 0; i < melist.length; i++) {
					System.out.println("****************************************");
					System.out.println("Method : "+melist[i].name);
					for (int j = 0; j < melist[i].parameter_list.length; j++) {
						System.out.println(melist[i].parameter_list[j]);
					}
					System.out.println("****************************************");
				}
 				
			  org.omg.CORBA.BooleanHolder flag = new org.omg.CORBA.BooleanHolder();
				AlarmIRPSystem.AlarmInformationIteratorHolder iter 
					= new AlarmIRPSystem.AlarmInformationIteratorHolder();
				
				ManagedGenericIRPConstDefs.StringTypeOpt sto = new ManagedGenericIRPConstDefs.StringTypeOpt();
				AlarmIRPConstDefs.DNTypeOpt base_object 
						= new AlarmIRPConstDefs.DNTypeOpt();
				sto.value(true, "");
				base_object.value("");
				org.omg.CORBA.IntHolder critical_count = new org.omg.CORBA.IntHolder();
				org.omg.CORBA.IntHolder major_count = new org.omg.CORBA.IntHolder();
				org.omg.CORBA.IntHolder minor_count = new org.omg.CORBA.IntHolder();
				org.omg.CORBA.IntHolder warning_count = new org.omg.CORBA.IntHolder();
				org.omg.CORBA.IntHolder indeterminate_count = new org.omg.CORBA.IntHolder();
				org.omg.CORBA.IntHolder cleared_count = new org.omg.CORBA.IntHolder();
				alarmRoot.get_alarm_count(sto, critical_count, major_count, minor_count, warning_count, indeterminate_count, cleared_count);
				System.out.println("critical_count : "+critical_count.value);
				System.out.println("major_count : "+major_count.value);
				System.out.println("minor_count : "+minor_count.value);
				System.out.println("warning_count : "+warning_count.value);
				System.out.println("indeterminate_count : "+indeterminate_count.value);
				System.out.println("cleared_count : "+cleared_count.value);
				
//				$e == 'DC=www.huawei.com , SubNetwork=1 , ManagementNode=1'
				sto.value(true, "$e == \'DC=www.huawei.com , SubNetwork=1 , ManagementNode=1\'");
//				sto.value(true,"$type_name == \'x3\' ");
				CosNotification.StructuredEvent[] str1 = null;
				try {
					str1 = alarmRoot.get_alarm_list(sto, base_object, flag, iter);
				} catch (Exception e) {
					// TODO: handle exception
				}finally{
					root.release_IRP_reference("zjpii-gp", iRPReference.value);
				}
		
				System.out.println(flag.value);
				System.out.println(str1.length);
				for(int i= 0; i<str1.length; i++){
					CosNotification.StructuredEvent structuredEvent = str1[i];
					System.out.println("event_name="+structuredEvent.header.fixed_header.event_name);
					System.out.println("domain_name="+structuredEvent.header.fixed_header.event_type.domain_name);
					System.out.println("type_name="+structuredEvent.header.fixed_header.event_type.type_name);
				for (int j = 0; j < structuredEvent.filterable_data.length; j++) {
					CosNotification.Property entry = structuredEvent.filterable_data[j];
					if(entry.name.equals("j")){
						System.out.println("alarm value  :   "+ entry.value.extract_string());
					}
				}
					System.out.println("*******************************************************");
				}
				//结束获取当前所有alarm
				
				org.omg.CORBA.StringHolder notificationIRPReference = new StringHolder("");
				root.get_IRP_reference("zjpii-gp", systemDN, notificationIRPId, notificationIRPReference);
				System.out.println(notificationIRPReference.value);
				NotificationIRPSystem.NotificationIRP notifyIRP = NotificationIRPSystem.NotificationIRPHelper.narrow(
						orb.string_to_object(notificationIRPReference.value));
				NotifyServer notifyServer = new NotifyServer();
				POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
				poa.the_POAManager().activate();
				org.omg.CORBA.Object objNotifyServer = poa.servant_to_reference(notifyServer);
				String manager_reference = orb.object_to_string(objNotifyServer);
				
				int time_tick = 0;
				String[] notification_categories = {};
				ManagedGenericIRPConstDefs.StringTypeOpt filter = new ManagedGenericIRPConstDefs.StringTypeOpt();
				filter.value(true,"$e == \'DC=www.huawei.com , SubNetwork=1 , ManagementNode=1\'");
				try {
//					String res = notifyIRP.attach_push(manager_reference, time_tick, notification_categories, filter);
//					System.out.println("success : "+res);
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					root.release_IRP_reference("zjpii-gp", notificationIRPReference.value);
//					notifyIRP._release();
				}

				System.out.println("******************************************************************");
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	  public void initHandle(Element confele)
	  {
	    this.parameter = confele.getChild("parameter");
//	    this.isSynAlarm = Boolean.valueOf(this.parameter.getChildTextTrim("isSynAlarm")).booleanValue();
//	    this.inmsAlm = new InmsProcessAlarm(this.parameter);
	  }

	  public void restartHandle()
	  {
	    stopHandle();
	    startHandle();
	  }
	  
	  public void sendOut(String string, java.lang.Object target)
	  {
	    if (target == null)
	      return;
	    if (target instanceof NMAlarm) {
	      NMAlarm alm = (NMAlarm)target;
	      logger.info(alm);

	      InmsEvent inmsEvent = new InmsEvent(alm.toElement());
	      this.listener.onEvent(inmsEvent);
	    }
	  }

	  public void setEventListener(InmsEventListener listener)
	  {
	    this.listener = listener;
	  }

	  public void startCollect() {
	    start();
	  }

	  public void startHandle()
	  {
	    start();
	  }

	  public String status()
	  {
	    return "";
	  }

	  public void stopCollect() {
	    this.endCollect = true;
	  }

	  public void stopHandle()
	  {
//	    if (this.emsPing != null) {
//	      this.emsPing.stop();
//	      this.emsPing = null;
//	    }

	    stop();
	  }
	  
		private static String getlocalIOR(String filename) {
			String ior = "";
			try {
				String file = "ior" +File.separator  + filename;
				System.out.println(file);
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				ior = br.readLine(); 
				return ior;
			} catch (Exception e) {
//				      logger.debug("Failed to read the IOR file : " + filename);
				e.printStackTrace();
				return null;
			}
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
