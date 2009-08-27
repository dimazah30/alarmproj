package NotificationIRPSystem;


/**
* NotificationIRPSystem/ChangeSubscriptionFilter.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
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
