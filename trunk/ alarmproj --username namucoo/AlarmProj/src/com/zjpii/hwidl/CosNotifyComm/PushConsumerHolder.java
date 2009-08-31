package CosNotifyComm;

/**
* CosNotifyComm/PushConsumerHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// NotifySubscribe
public final class PushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.PushConsumer value = null;

  public PushConsumerHolder ()
  {
  }

  public PushConsumerHolder (CosNotifyComm.PushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.PushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.PushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.PushConsumerHelper.type ();
  }

}
