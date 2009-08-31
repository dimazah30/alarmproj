package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetSubscriptionStatus.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分29秒 CST
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
