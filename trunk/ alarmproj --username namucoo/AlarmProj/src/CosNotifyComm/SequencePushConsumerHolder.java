package CosNotifyComm;

/**
* CosNotifyComm/SequencePushConsumerHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPushSupplier
public final class SequencePushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.SequencePushConsumer value = null;

  public SequencePushConsumerHolder ()
  {
  }

  public SequencePushConsumerHolder (CosNotifyComm.SequencePushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.SequencePushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.SequencePushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.SequencePushConsumerHelper.type ();
  }

}
