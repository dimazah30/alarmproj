package CosNotifyComm;

/**
* CosNotifyComm/NotifySubscribeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// NotifyPublish
public final class NotifySubscribeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.NotifySubscribe value = null;

  public NotifySubscribeHolder ()
  {
  }

  public NotifySubscribeHolder (CosNotifyComm.NotifySubscribe initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.NotifySubscribeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.NotifySubscribeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.NotifySubscribeHelper.type ();
  }

}
