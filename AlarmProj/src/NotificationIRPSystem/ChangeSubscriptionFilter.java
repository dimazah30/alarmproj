package NotificationIRPSystem;


/**
* NotificationIRPSystem/ChangeSubscriptionFilter.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class ChangeSubscriptionFilter extends org.omg.CORBA.UserException
{
  public String reason = null;

  public ChangeSubscriptionFilter ()
  {
    super(ChangeSubscriptionFilterHelper.id());
  } // ctor

  public ChangeSubscriptionFilter (String _reason)
  {
    super(ChangeSubscriptionFilterHelper.id());
    reason = _reason;
  } // ctor


  public ChangeSubscriptionFilter (String $reason, String _reason)
  {
    super(ChangeSubscriptionFilterHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class ChangeSubscriptionFilter
