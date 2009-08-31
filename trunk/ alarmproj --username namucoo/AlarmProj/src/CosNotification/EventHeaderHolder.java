package CosNotification;

/**
* CosNotification/EventHeaderHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class EventHeaderHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.EventHeader value = null;

  public EventHeaderHolder ()
  {
  }

  public EventHeaderHolder (CosNotification.EventHeader initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.EventHeaderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.EventHeaderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.EventHeaderHelper.type ();
  }

}
