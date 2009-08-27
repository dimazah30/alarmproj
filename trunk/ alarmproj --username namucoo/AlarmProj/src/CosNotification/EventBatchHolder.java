package CosNotification;


/**
* CosNotification/EventBatchHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/


// StructuredEvent
public final class EventBatchHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.StructuredEvent value[] = null;

  public EventBatchHolder ()
  {
  }

  public EventBatchHolder (CosNotification.StructuredEvent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.EventBatchHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.EventBatchHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.EventBatchHelper.type ();
  }

}
