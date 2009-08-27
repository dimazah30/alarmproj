package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmIRPOperationsProfile.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class GetAlarmIRPOperationsProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmIRPOperationsProfile ()
  {
    super(GetAlarmIRPOperationsProfileHelper.id());
  } // ctor

  public GetAlarmIRPOperationsProfile (String _reason)
  {
    super(GetAlarmIRPOperationsProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmIRPOperationsProfile (String $reason, String _reason)
  {
    super(GetAlarmIRPOperationsProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmIRPOperationsProfile
