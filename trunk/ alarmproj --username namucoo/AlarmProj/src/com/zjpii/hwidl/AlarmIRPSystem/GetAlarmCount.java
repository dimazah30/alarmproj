package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmCount.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class GetAlarmCount extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmCount ()
  {
    super(GetAlarmCountHelper.id());
  } // ctor

  public GetAlarmCount (String _reason)
  {
    super(GetAlarmCountHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmCount (String $reason, String _reason)
  {
    super(GetAlarmCountHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmCount
