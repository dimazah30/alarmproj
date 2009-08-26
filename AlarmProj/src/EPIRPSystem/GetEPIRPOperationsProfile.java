package EPIRPSystem;


/**
* EPIRPSystem/GetEPIRPOperationsProfile.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetEPIRPOperationsProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPOperationsProfile ()
  {
    super(GetEPIRPOperationsProfileHelper.id());
  } // ctor

  public GetEPIRPOperationsProfile (String _reason)
  {
    super(GetEPIRPOperationsProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPOperationsProfile (String $reason, String _reason)
  {
    super(GetEPIRPOperationsProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPOperationsProfile
