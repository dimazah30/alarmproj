package AlarmIRPSystem;


/**
* AlarmIRPSystem/UnacknowledgeAlarms.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
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
