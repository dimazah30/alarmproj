package NotificationIRPConstDefs;

/**
* NotificationIRPConstDefs/SubscriptionStateHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   This indicates if the subscription is Active (not suspended), Suspended,
   or Invalid.
   */
public final class SubscriptionStateHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPConstDefs.SubscriptionState value = null;

  public SubscriptionStateHolder ()
  {
  }

  public SubscriptionStateHolder (NotificationIRPConstDefs.SubscriptionState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.SubscriptionStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.SubscriptionStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.SubscriptionStateHelper.type ();
  }

}
