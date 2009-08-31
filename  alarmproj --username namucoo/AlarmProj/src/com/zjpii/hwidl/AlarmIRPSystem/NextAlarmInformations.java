package AlarmIRPSystem;


/**
* AlarmIRPSystem/NextAlarmInformations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class NextAlarmInformations extends org.omg.CORBA.UserException
{
  public String reason = null;

  public NextAlarmInformations ()
  {
    super(NextAlarmInformationsHelper.id());
  } // ctor

  public NextAlarmInformations (String _reason)
  {
    super(NextAlarmInformationsHelper.id());
    reason = _reason;
  } // ctor


  public NextAlarmInformations (String $reason, String _reason)
  {
    super(NextAlarmInformationsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class NextAlarmInformations
