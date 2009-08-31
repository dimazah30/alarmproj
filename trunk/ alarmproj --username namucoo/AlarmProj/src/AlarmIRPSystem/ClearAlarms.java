package AlarmIRPSystem;


/**
* AlarmIRPSystem/ClearAlarms.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class ClearAlarms extends org.omg.CORBA.UserException
{
  public String reason = null;

  public ClearAlarms ()
  {
    super(ClearAlarmsHelper.id());
  } // ctor

  public ClearAlarms (String _reason)
  {
    super(ClearAlarmsHelper.id());
    reason = _reason;
  } // ctor


  public ClearAlarms (String $reason, String _reason)
  {
    super(ClearAlarmsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class ClearAlarms
