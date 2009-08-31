package CosNotification;

/**
* CosNotification/PropertyRangeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class PropertyRangeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.PropertyRange value = null;

  public PropertyRangeHolder ()
  {
  }

  public PropertyRangeHolder (CosNotification.PropertyRange initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.PropertyRangeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.PropertyRangeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.PropertyRangeHelper.type ();
  }

}
