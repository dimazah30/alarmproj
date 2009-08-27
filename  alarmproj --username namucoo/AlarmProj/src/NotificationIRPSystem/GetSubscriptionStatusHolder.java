package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetSubscriptionStatusHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public final class GetSubscriptionStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetSubscriptionStatus value = null;

  public GetSubscriptionStatusHolder ()
  {
  }

  public GetSubscriptionStatusHolder (NotificationIRPSystem.GetSubscriptionStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetSubscriptionStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetSubscriptionStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetSubscriptionStatusHelper.type ();
  }

}
