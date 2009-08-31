package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/AttributeNameValue.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   Define the parameters (in the notification header) specified in
   the Notification IRP: IS.
   */
public interface AttributeNameValue extends AttributeNameValueOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final String NOTIFICATION_ID = "a";
  public static final String EVENT_TIME = "b";
  public static final String SYSTEM_DN = "c";
  public static final String MANAGED_OBJECT_CLASS = "d";
  public static final String MANAGED_OBJECT_INSTANCE = "e";
  public static final String NOTIFICATION_TYPE = "ee";
} // interface AttributeNameValue
