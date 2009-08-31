package com.xc.alarm.wri.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jdom.Element;
import org.omg.PortableServer.POA;

import AlarmIRPSystem.AlarmIRP;

import com.cattsoft.common.EventSource;
import com.cattsoft.common.InmsEvent;
import com.cattsoft.common.InmsEventListener;
import com.cattsoft.common.alarm.NMAlarm;
import com.cattsoft.utility.log.LoggerFactory;
import com.xc.alarm.hw.impl.M2000AlarmAdapter;


public class WRIAlarmAdapter extends Thread implements EventSource  {
	
	  private static Logger logger = LoggerFactory.getLogger(WRIAlarmAdapter.class.getName());
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
