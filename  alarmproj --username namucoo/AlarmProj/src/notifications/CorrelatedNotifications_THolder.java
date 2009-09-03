package notifications;

/**
* notifications/CorrelatedNotifications_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/

public final class CorrelatedNotifications_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.CorrelatedNotifications_T value = null;

  public CorrelatedNotifications_THolder ()
  {
  }

  public CorrelatedNotifications_THolder (notifications.CorrelatedNotifications_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.CorrelatedNotifications_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.CorrelatedNotifications_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.CorrelatedNotifications_THelper.type ();
  }

}
