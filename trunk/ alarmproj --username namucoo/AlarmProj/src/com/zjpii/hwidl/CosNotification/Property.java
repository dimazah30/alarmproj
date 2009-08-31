package CosNotification;


/**
* CosNotification/Property.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class Property implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public org.omg.CORBA.Any value = null;

  public Property ()
  {
  } // ctor

  public Property (String _name, org.omg.CORBA.Any _value)
  {
    name = _name;
    value = _value;
  } // ctor

} // class Property
