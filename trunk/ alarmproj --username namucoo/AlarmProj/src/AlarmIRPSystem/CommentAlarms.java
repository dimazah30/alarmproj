package AlarmIRPSystem;


/**
* AlarmIRPSystem/CommentAlarms.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
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
