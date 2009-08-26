package AlarmIRPSystem;


/**
* AlarmIRPSystem/ClearAlarms.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
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
