package NotificationIRPConstDefs;

/**
* NotificationIRPConstDefs/AttributeNameValueHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   Define the parameters (in the notification header) specified in
   the Notification IRP: IS.
   */
public final class AttributeNameValueHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPConstDefs.AttributeNameValue value = null;

  public AttributeNameValueHolder ()
  {
  }

  public AttributeNameValueHolder (NotificationIRPConstDefs.AttributeNameValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.AttributeNameValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.AttributeNameValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.AttributeNameValueHelper.type ();
  }

}
