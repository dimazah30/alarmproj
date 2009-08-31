package EPIRPSystem;

/**
* EPIRPSystem/IRPElementHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class IRPElementHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.IRPElement value = null;

  public IRPElementHolder ()
  {
  }

  public IRPElementHolder (EPIRPSystem.IRPElement initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.IRPElementHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.IRPElementHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.IRPElementHelper.type ();
  }

}
