package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmIRPVersions.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmIRPVersions extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmIRPVersions ()
  {
    super(GetAlarmIRPVersionsHelper.id());
  } // ctor

  public GetAlarmIRPVersions (String _reason)
  {
    super(GetAlarmIRPVersionsHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmIRPVersions (String $reason, String _reason)
  {
    super(GetAlarmIRPVersionsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmIRPVersions
