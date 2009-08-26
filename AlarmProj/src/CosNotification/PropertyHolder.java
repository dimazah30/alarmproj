package CosNotification;

/**
* CosNotification/PropertyHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class PropertyHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.Property value = null;

  public PropertyHolder ()
  {
  }

  public PropertyHolder (CosNotification.Property initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.PropertyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.PropertyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.PropertyHelper.type ();
  }

}
