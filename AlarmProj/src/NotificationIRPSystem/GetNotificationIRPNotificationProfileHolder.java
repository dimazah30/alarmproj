package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetNotificationIRPNotificationProfileHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class GetNotificationIRPNotificationProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetNotificationIRPNotificationProfile value = null;

  public GetNotificationIRPNotificationProfileHolder ()
  {
  }

  public GetNotificationIRPNotificationProfileHolder (NotificationIRPSystem.GetNotificationIRPNotificationProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetNotificationIRPNotificationProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetNotificationIRPNotificationProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetNotificationIRPNotificationProfileHelper.type ();
  }

}
