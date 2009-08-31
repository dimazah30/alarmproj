package CosNotification;


/**
* CosNotification/PropertyRange.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class PropertyRange implements org.omg.CORBA.portable.IDLEntity
{
  public org.omg.CORBA.Any low_val = null;
  public org.omg.CORBA.Any high_val = null;

  public PropertyRange ()
  {
  } // ctor

  public PropertyRange (org.omg.CORBA.Any _low_val, org.omg.CORBA.Any _high_val)
  {
    low_val = _low_val;
    high_val = _high_val;
  } // ctor

} // class PropertyRange
