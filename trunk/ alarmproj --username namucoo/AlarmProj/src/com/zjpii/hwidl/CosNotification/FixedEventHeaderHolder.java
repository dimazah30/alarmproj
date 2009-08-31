package CosNotification;

/**
* CosNotification/FixedEventHeaderHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class FixedEventHeaderHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.FixedEventHeader value = null;

  public FixedEventHeaderHolder ()
  {
  }

  public FixedEventHeaderHolder (CosNotification.FixedEventHeader initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.FixedEventHeaderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.FixedEventHeaderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.FixedEventHeaderHelper.type ();
  }

}
