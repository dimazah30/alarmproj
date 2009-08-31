package AlarmIRPSystem;


/**
* AlarmIRPSystem/UnacknowledgeAlarms.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class UnacknowledgeAlarms extends org.omg.CORBA.UserException
{
  public String reason = null;

  public UnacknowledgeAlarms ()
  {
    super(UnacknowledgeAlarmsHelper.id());
  } // ctor

  public UnacknowledgeAlarms (String _reason)
  {
    super(UnacknowledgeAlarmsHelper.id());
    reason = _reason;
  } // ctor


  public UnacknowledgeAlarms (String $reason, String _reason)
  {
    super(UnacknowledgeAlarmsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class UnacknowledgeAlarms
