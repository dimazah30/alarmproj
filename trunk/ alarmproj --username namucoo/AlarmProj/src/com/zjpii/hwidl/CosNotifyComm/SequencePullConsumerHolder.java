package CosNotifyComm;

/**
* CosNotifyComm/SequencePullConsumerHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// SequencePushConsumer
public final class SequencePullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.SequencePullConsumer value = null;

  public SequencePullConsumerHolder ()
  {
  }

  public SequencePullConsumerHolder (CosNotifyComm.SequencePullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.SequencePullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.SequencePullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.SequencePullConsumerHelper.type ();
  }

}
