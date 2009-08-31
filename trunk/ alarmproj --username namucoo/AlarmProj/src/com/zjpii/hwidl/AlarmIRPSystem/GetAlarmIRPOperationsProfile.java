package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmIRPOperationsProfile.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmIRPOperationsProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmIRPOperationsProfile ()
  {
    super(GetAlarmIRPOperationsProfileHelper.id());
  } // ctor

  public GetAlarmIRPOperationsProfile (String _reason)
  {
    super(GetAlarmIRPOperationsProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmIRPOperationsProfile (String $reason, String _reason)
  {
    super(GetAlarmIRPOperationsProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmIRPOperationsProfile
