package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmList.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class GetAlarmList extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmList ()
  {
    super(GetAlarmListHelper.id());
  } // ctor

  public GetAlarmList (String _reason)
  {
    super(GetAlarmListHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmList (String $reason, String _reason)
  {
    super(GetAlarmListHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmList
