package EPIRPSystem;

/**
* EPIRPSystem/ReleaseIRPReferenceHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class ReleaseIRPReferenceHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.ReleaseIRPReference value = null;

  public ReleaseIRPReferenceHolder ()
  {
  }

  public ReleaseIRPReferenceHolder (EPIRPSystem.ReleaseIRPReference initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.ReleaseIRPReferenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.ReleaseIRPReferenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.ReleaseIRPReferenceHelper.type ();
  }

}
