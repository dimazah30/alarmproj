package EPIRPSystem;

/**
* EPIRPSystem/IRPManagementScopeOptHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class IRPManagementScopeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.IRPManagementScopeOpt value = null;

  public IRPManagementScopeOptHolder ()
  {
  }

  public IRPManagementScopeOptHolder (EPIRPSystem.IRPManagementScopeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.IRPManagementScopeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.IRPManagementScopeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.IRPManagementScopeOptHelper.type ();
  }

}
