package CosNotification;


/**
* CosNotification/NamedPropertyRange.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class NamedPropertyRange implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public CosNotification.PropertyRange range = null;

  public NamedPropertyRange ()
  {
  } // ctor

  public NamedPropertyRange (String _name, CosNotification.PropertyRange _range)
  {
    name = _name;
    range = _range;
  } // ctor

} // class NamedPropertyRange
