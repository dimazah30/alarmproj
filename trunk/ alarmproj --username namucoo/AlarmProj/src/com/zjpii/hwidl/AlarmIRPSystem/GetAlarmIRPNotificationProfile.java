package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmIRPNotificationProfile.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmIRPNotificationProfile ()
  {
    super(GetAlarmIRPNotificationProfileHelper.id());
  } // ctor

  public GetAlarmIRPNotificationProfile (String _reason)
  {
    super(GetAlarmIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetAlarmIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmIRPNotificationProfile
