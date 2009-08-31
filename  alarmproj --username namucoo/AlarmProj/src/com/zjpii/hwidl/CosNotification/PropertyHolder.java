package CosNotification;

/**
* CosNotification/PropertyHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class PropertyHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.Property value = null;

  public PropertyHolder ()
  {
  }

  public PropertyHolder (CosNotification.Property initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.PropertyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.PropertyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.PropertyHelper.type ();
  }

}
