package EPIRPSystem;

/**
* EPIRPSystem/GetEPIRPVersionsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetEPIRPVersionsHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.GetEPIRPVersions value = null;

  public GetEPIRPVersionsHolder ()
  {
  }

  public GetEPIRPVersionsHolder (EPIRPSystem.GetEPIRPVersions initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.GetEPIRPVersionsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.GetEPIRPVersionsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.GetEPIRPVersionsHelper.type ();
  }

}
