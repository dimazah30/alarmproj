package NotificationIRPSystem;

/**
* NotificationIRPSystem/ChangeSubscriptionFilterHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分29秒 CST
*/

public final class ChangeSubscriptionFilterHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.ChangeSubscriptionFilter value = null;

  public ChangeSubscriptionFilterHolder ()
  {
  }

  public ChangeSubscriptionFilterHolder (NotificationIRPSystem.ChangeSubscriptionFilter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.ChangeSubscriptionFilterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.ChangeSubscriptionFilterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.ChangeSubscriptionFilterHelper.type ();
  }

}
