package AlarmIRPSystem;


/**
* AlarmIRPSystem/AcknowledgeAlarms.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
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
