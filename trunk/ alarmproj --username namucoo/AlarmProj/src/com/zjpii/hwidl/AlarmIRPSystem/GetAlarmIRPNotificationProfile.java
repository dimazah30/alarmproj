package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmIRPNotificationProfile.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class GetAlarmIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmIRPNotificationProfile ()
  {
    super(GetAlarmIRPNotificationProfileHelper.id());
  } // ctor

  public GetAlarmIRPNotificationProfile (String _reason)
  {
    super(GetAlarmIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetAlarmIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmIRPNotificationProfile
