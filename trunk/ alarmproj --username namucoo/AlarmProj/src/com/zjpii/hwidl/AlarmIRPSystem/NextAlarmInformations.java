package AlarmIRPSystem;


/**
* AlarmIRPSystem/NextAlarmInformations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
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
