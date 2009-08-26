package EPIRPSystem;

/**
* EPIRPSystem/UnknownIRPReferenceHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class UnknownIRPReferenceHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.UnknownIRPReference value = null;

  public UnknownIRPReferenceHolder ()
  {
  }

  public UnknownIRPReferenceHolder (EPIRPSystem.UnknownIRPReference initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.UnknownIRPReferenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.UnknownIRPReferenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.UnknownIRPReferenceHelper.type ();
  }

}
