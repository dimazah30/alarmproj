package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationIRPOperationsProfile.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��29�� CST
*/

public final class GetNotificationIRPOperationsProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetNotificationIRPOperationsProfile ()
  {
    super(GetNotificationIRPOperationsProfileHelper.id());
  } // ctor

  public GetNotificationIRPOperationsProfile (String _reason)
  {
    super(GetNotificationIRPOperationsProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetNotificationIRPOperationsProfile (String $reason, String _reason)
  {
    super(GetNotificationIRPOperationsProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetNotificationIRPOperationsProfile
