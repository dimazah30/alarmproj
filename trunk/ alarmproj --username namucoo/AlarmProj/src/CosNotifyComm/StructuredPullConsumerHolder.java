package CosNotifyComm;

/**
* CosNotifyComm/StructuredPullConsumerHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPushConsumer
public final class StructuredPullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPullConsumer value = null;

  public StructuredPullConsumerHolder ()
  {
  }

  public StructuredPullConsumerHolder (CosNotifyComm.StructuredPullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPullConsumerHelper.type ();
  }

}
