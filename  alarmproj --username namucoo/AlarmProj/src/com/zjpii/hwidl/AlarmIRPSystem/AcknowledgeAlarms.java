package AlarmIRPSystem;


/**
* AlarmIRPSystem/AcknowledgeAlarms.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class AcknowledgeAlarms extends org.omg.CORBA.UserException
{
  public String reason = null;

  public AcknowledgeAlarms ()
  {
    super(AcknowledgeAlarmsHelper.id());
  } // ctor

  public AcknowledgeAlarms (String _reason)
  {
    super(AcknowledgeAlarmsHelper.id());
    reason = _reason;
  } // ctor


  public AcknowledgeAlarms (String $reason, String _reason)
  {
    super(AcknowledgeAlarmsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class AcknowledgeAlarms
