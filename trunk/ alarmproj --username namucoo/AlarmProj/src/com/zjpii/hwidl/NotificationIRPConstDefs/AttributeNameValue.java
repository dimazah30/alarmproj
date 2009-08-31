package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/AttributeNameValue.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��11�� CST
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
