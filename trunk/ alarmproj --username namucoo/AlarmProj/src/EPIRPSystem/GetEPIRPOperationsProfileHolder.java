package EPIRPSystem;

/**
* EPIRPSystem/GetEPIRPOperationsProfileHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetEPIRPOperationsProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.GetEPIRPOperationsProfile value = null;

  public GetEPIRPOperationsProfileHolder ()
  {
  }

  public GetEPIRPOperationsProfileHolder (EPIRPSystem.GetEPIRPOperationsProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.GetEPIRPOperationsProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.GetEPIRPOperationsProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.GetEPIRPOperationsProfileHelper.type ();
  }

}
