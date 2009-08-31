package AlarmIRPSystem;


/**
* AlarmIRPSystem/CommentAlarms.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class CommentAlarms extends org.omg.CORBA.UserException
{
  public String reason = null;

  public CommentAlarms ()
  {
    super(CommentAlarmsHelper.id());
  } // ctor

  public CommentAlarms (String _reason)
  {
    super(CommentAlarmsHelper.id());
    reason = _reason;
  } // ctor


  public CommentAlarms (String $reason, String _reason)
  {
    super(CommentAlarmsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class CommentAlarms
