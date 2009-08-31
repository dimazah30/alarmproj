package EPIRPSystem;


/**
* EPIRPSystem/GetEPIRPVersions.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetEPIRPVersions extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPVersions ()
  {
    super(GetEPIRPVersionsHelper.id());
  } // ctor

  public GetEPIRPVersions (String _reason)
  {
    super(GetEPIRPVersionsHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPVersions (String $reason, String _reason)
  {
    super(GetEPIRPVersionsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPVersions
