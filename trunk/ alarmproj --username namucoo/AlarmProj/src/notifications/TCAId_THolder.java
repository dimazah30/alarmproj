package notifications;

/**
* notifications/TCAId_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/

public final class TCAId_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.TCAId_T value = null;

  public TCAId_THolder ()
  {
  }

  public TCAId_THolder (notifications.TCAId_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.TCAId_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.TCAId_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.TCAId_THelper.type ();
  }

}
