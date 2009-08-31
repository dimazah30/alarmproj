package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetSubscriptionIds.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分30秒 CST
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
