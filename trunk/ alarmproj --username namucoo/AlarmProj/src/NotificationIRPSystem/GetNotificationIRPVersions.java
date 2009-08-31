package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationIRPVersions.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��29�� CST
*/

public final class GetNotificationIRPVersions extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetNotificationIRPVersions ()
  {
    super(GetNotificationIRPVersionsHelper.id());
  } // ctor

  public GetNotificationIRPVersions (String _reason)
  {
    super(GetNotificationIRPVersionsHelper.id());
    reason = _reason;
  } // ctor


  public GetNotificationIRPVersions (String $reason, String _reason)
  {
    super(GetNotificationIRPVersionsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetNotificationIRPVersions
