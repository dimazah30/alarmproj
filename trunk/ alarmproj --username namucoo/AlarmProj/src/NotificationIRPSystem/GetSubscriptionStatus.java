package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetSubscriptionStatus.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
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
