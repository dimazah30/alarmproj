package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetSubscriptionIds.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class GetSubscriptionIds extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetSubscriptionIds ()
  {
    super(GetSubscriptionIdsHelper.id());
  } // ctor

  public GetSubscriptionIds (String _reason)
  {
    super(GetSubscriptionIdsHelper.id());
    reason = _reason;
  } // ctor


  public GetSubscriptionIds (String $reason, String _reason)
  {
    super(GetSubscriptionIdsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetSubscriptionIds
