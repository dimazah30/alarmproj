package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationIRPVersions.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分29秒 CST
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
