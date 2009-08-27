package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmIRPVersions.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class GetAlarmIRPVersions extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmIRPVersions ()
  {
    super(GetAlarmIRPVersionsHelper.id());
  } // ctor

  public GetAlarmIRPVersions (String _reason)
  {
    super(GetAlarmIRPVersionsHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmIRPVersions (String $reason, String _reason)
  {
    super(GetAlarmIRPVersionsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmIRPVersions
