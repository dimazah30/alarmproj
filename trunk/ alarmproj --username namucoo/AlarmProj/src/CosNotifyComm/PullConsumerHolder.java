package CosNotifyComm;

/**
* CosNotifyComm/PullConsumerHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// PushConsumer
public final class PullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.PullConsumer value = null;

  public PullConsumerHolder ()
  {
  }

  public PullConsumerHolder (CosNotifyComm.PullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.PullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.PullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.PullConsumerHelper.type ();
  }

}
