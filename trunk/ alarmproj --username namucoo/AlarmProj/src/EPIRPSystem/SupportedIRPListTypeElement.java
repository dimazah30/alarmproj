package EPIRPSystem;


/**
* EPIRPSystem/SupportedIRPListTypeElement.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class SupportedIRPListTypeElement implements org.omg.CORBA.portable.IDLEntity
{
  public String systemDN = null;
  public EPIRPSystem.IRPElement irpList[] = null;

  public SupportedIRPListTypeElement ()
  {
  } // ctor

  public SupportedIRPListTypeElement (String _systemDN, EPIRPSystem.IRPElement[] _irpList)
  {
    systemDN = _systemDN;
    irpList = _irpList;
  } // ctor

} // class SupportedIRPListTypeElement
