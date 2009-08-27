package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationIRPNotificationProfile.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class GetNotificationIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetNotificationIRPNotificationProfile ()
  {
    super(GetNotificationIRPNotificationProfileHelper.id());
  } // ctor

  public GetNotificationIRPNotificationProfile (String _reason)
  {
    super(GetNotificationIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetNotificationIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetNotificationIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetNotificationIRPNotificationProfile
