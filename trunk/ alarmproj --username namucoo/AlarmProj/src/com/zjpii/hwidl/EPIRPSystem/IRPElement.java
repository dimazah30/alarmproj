package EPIRPSystem;


/**
* EPIRPSystem/IRPElement.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class IRPElement implements org.omg.CORBA.portable.IDLEntity
{
  public String irpId = null;
  public String irpVersions[] = null;
  public EPIRPSystem.IRPManagementScopeOpt irpManagementScope = null;

  public IRPElement ()
  {
  } // ctor

  public IRPElement (String _irpId, String[] _irpVersions, EPIRPSystem.IRPManagementScopeOpt _irpManagementScope)
  {
    irpId = _irpId;
    irpVersions = _irpVersions;
    irpManagementScope = _irpManagementScope;
  } // ctor

} // class IRPElement
