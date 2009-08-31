package EPIRPSystem;


/**
* EPIRPSystem/DNListTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class DNListTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public DNListTypeHolder ()
  {
  }

  public DNListTypeHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.DNListTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.DNListTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.DNListTypeHelper.type ();
  }

}
