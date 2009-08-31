package EPIRPSystem;


/**
* EPIRPSystem/GetEPIRPNotificationProfile.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetEPIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPNotificationProfile ()
  {
    super(GetEPIRPNotificationProfileHelper.id());
  } // ctor

  public GetEPIRPNotificationProfile (String _reason)
  {
    super(GetEPIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetEPIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPNotificationProfile
