package CosNotification;

/**
* CosNotification/UnsupportedQoSHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class UnsupportedQoSHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.UnsupportedQoS value = null;

  public UnsupportedQoSHolder ()
  {
  }

  public UnsupportedQoSHolder (CosNotification.UnsupportedQoS initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.UnsupportedQoSHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.UnsupportedQoSHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.UnsupportedQoSHelper.type ();
  }

}
