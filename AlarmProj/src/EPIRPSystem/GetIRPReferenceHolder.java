package EPIRPSystem;

/**
* EPIRPSystem/GetIRPReferenceHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetIRPReferenceHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.GetIRPReference value = null;

  public GetIRPReferenceHolder ()
  {
  }

  public GetIRPReferenceHolder (EPIRPSystem.GetIRPReference initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.GetIRPReferenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.GetIRPReferenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.GetIRPReferenceHelper.type ();
  }

}
