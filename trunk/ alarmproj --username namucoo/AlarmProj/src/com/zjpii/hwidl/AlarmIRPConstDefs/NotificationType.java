package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/NotificationType.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the notification types defined by this
   Alarm IRP version.
   */
public interface NotificationType extends NotificationTypeOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final String NOTIFY_FM_NEW_ALARM = "x1";
  public static final String NOTIFY_FM_CHANGED_ALARM = "x2";
  public static final String NOTIFY_FM_ACK_STATE_CHANGED = "x3";
  public static final String NOTIFY_FM_COMMENT_ADDED = "x4";
  public static final String NOTIFY_FM_CLEARED_ALARM = "x5";
  public static final String NOTIFY_FM_ALARM_LIST_REBUILT = "x6";
  public static final String NOTIFY_FM_POTENTIAL_FAULTY_ALARM_LIST = "x7";
} // interface NotificationType
