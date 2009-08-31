package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetSubscriptionStatus.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��29�� CST
*/

public final class GetSubscriptionStatus extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetSubscriptionStatus ()
  {
    super(GetSubscriptionStatusHelper.id());
  } // ctor

  public GetSubscriptionStatus (String _reason)
  {
    super(GetSubscriptionStatusHelper.id());
    reason = _reason;
  } // ctor


  public GetSubscriptionStatus (String $reason, String _reason)
  {
    super(GetSubscriptionStatusHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetSubscriptionStatus
