package CosNotifyComm;

/**
* CosNotifyComm/StructuredPushConsumerHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/

public final class StructuredPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPushConsumer value = null;

  public StructuredPushConsumerHolder ()
  {
  }

  public StructuredPushConsumerHolder (CosNotifyComm.StructuredPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPushConsumerHelper.type ();
  }

}
