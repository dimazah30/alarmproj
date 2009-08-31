package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetNotificationIRPVersionsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class GetNotificationIRPVersionsHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetNotificationIRPVersions value = null;

  public GetNotificationIRPVersionsHolder ()
  {
  }

  public GetNotificationIRPVersionsHolder (NotificationIRPSystem.GetNotificationIRPVersions initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetNotificationIRPVersionsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetNotificationIRPVersionsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetNotificationIRPVersionsHelper.type ();
  }

}
