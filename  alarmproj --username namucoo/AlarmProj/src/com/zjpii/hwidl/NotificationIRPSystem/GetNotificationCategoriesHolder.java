package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetNotificationCategoriesHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public final class GetNotificationCategoriesHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetNotificationCategories value = null;

  public GetNotificationCategoriesHolder ()
  {
  }

  public GetNotificationCategoriesHolder (NotificationIRPSystem.GetNotificationCategories initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetNotificationCategoriesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetNotificationCategoriesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetNotificationCategoriesHelper.type ();
  }

}
