package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetNotificationIRPNotificationProfileHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
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
