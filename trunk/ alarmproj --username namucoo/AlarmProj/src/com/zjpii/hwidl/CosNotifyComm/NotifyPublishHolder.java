package CosNotifyComm;

/**
* CosNotifyComm/NotifyPublishHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/

public final class NotifyPublishHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.NotifyPublish value = null;

  public NotifyPublishHolder ()
  {
  }

  public NotifyPublishHolder (CosNotifyComm.NotifyPublish initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.NotifyPublishHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.NotifyPublishHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.NotifyPublishHelper.type ();
  }

}
