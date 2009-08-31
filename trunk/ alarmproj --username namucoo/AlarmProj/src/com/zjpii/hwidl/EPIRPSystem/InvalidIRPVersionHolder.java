package EPIRPSystem;

/**
* EPIRPSystem/InvalidIRPVersionHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class InvalidIRPVersionHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.InvalidIRPVersion value = null;

  public InvalidIRPVersionHolder ()
  {
  }

  public InvalidIRPVersionHolder (EPIRPSystem.InvalidIRPVersion initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.InvalidIRPVersionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.InvalidIRPVersionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.InvalidIRPVersionHelper.type ();
  }

}
