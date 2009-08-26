package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/NotificationTypeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the notification types defined by this
   Alarm IRP version.
   */
public final class NotificationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.NotificationType value = null;

  public NotificationTypeHolder ()
  {
  }

  public NotificationTypeHolder (AlarmIRPConstDefs.NotificationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.NotificationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.NotificationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.NotificationTypeHelper.type ();
  }

}
