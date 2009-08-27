package CosNotification;

/**
* CosNotification/NamedPropertyRangeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class NamedPropertyRangeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.NamedPropertyRange value = null;

  public NamedPropertyRangeHolder ()
  {
  }

  public NamedPropertyRangeHolder (CosNotification.NamedPropertyRange initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.NamedPropertyRangeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.NamedPropertyRangeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.NamedPropertyRangeHelper.type ();
  }

}
