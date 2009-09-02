package com.xc.alarm.wri.impl;

import java.util.Properties;

import org.omg.CosNaming.*;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManager;

import com.xc.alarm.hw.impl.HWAlarmCollector;
public class FHAlarmCollector implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		try {
			collect( );
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FHAlarmCollector collect = new FHAlarmCollector();
		collect.run();
	}
	
	
	private void collect( ){
		POA rootpoa;
		POAManager rootMgr ;
		try {
			  String[]   aryArgs   =   new   String[3];   
			  aryArgs[0]   =   "-ORBInitRef";   
			  aryArgs[1]   =   "NameService=corbaloc::"   +   "134.103.41.64"   +   ":"   +   "9000"   +   "/NameService";   
			  aryArgs[2]   =   "-OAthread_per_request";  

			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(aryArgs, null);
			 // Obtain the root context.
		      org.omg.CORBA.Object rootObj = orb.resolve_initial_references("RootPOA");
		      rootpoa= POAHelper.narrow(rootObj);
		       rootMgr = rootpoa.the_POAManager();
		     
		      
		      try {
		    	  rootMgr.activate();
		    	  org.omg.CORBA.Object nameObj = orb.resolve_initial_references("NameService");
		    	  System.out.println(nameObj);

		    	  NamingContextExt root = NamingContextExtHelper.narrow(nameObj);
		    	  System.out.println(root);
		    	  
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				rootMgr.deactivate(false, true);
			}
//		      NamingContextExt root = NamingContextExtHelper.narrow(rootObj);
		      // Locate an account manager through the Naming Service.
		      // Note that casting is needed as a workaround for a JDK 1.1.x bug.
//		      org.omg.CORBA.Object mgrObj = ((NamingContext)root).resolve(root.to_name("WRI"));
		      
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	      
//	      Bank.AccountManager manager =  Bank.AccountManagerHelper.narrow(mgrObj);
//	      // use args[0] as the account name, or a default.
//	      String name = args.length > 0 ? args[0] : "Jack B. Quick";
//	      // Request the account manager to open a named account.
//	      Bank.Account account = manager.open(name);
//	      // Get the balance of the account.
//	      float balance = account.balance();
//	      // Print out the balance.
//	      System.out.println
//	        ("The balance in " + name + "'s account is $" + balance);

	}

}
