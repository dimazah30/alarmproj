package CosNotification;


/**
* CosNotification/EventTypeSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class EventTypeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.EventType value[] = null;

  public EventTypeSeqHolder ()
  {
  }

  public EventTypeSeqHolder (CosNotification.EventType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.EventTypeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.EventTypeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.EventTypeSeqHelper.type ();
  }

}
