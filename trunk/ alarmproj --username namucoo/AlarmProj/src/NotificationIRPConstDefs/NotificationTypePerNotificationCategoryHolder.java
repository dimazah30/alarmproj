package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/NotificationTypePerNotificationCategoryHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   It defines the notification types of a particular notification category.
   */
public final class NotificationTypePerNotificationCategoryHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public NotificationTypePerNotificationCategoryHolder ()
  {
  }

  public NotificationTypePerNotificationCategoryHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.NotificationTypePerNotificationCategoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.NotificationTypePerNotificationCategoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.NotificationTypePerNotificationCategoryHelper.type ();
  }

}
