package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationIRPNotificationProfile.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public final class GetNotificationIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetNotificationIRPNotificationProfile ()
  {
    super(GetNotificationIRPNotificationProfileHelper.id());
  } // ctor

  public GetNotificationIRPNotificationProfile (String _reason)
  {
    super(GetNotificationIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetNotificationIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetNotificationIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetNotificationIRPNotificationProfile
