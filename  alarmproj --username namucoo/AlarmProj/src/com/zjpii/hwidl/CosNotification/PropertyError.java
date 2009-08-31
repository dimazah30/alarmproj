package CosNotification;


/**
* CosNotification/PropertyError.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class PropertyError implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.QoSError_code code = null;
  public String name = null;
  public CosNotification.PropertyRange available_range = null;

  public PropertyError ()
  {
  } // ctor

  public PropertyError (CosNotification.QoSError_code _code, String _name, CosNotification.PropertyRange _available_range)
  {
    code = _code;
    name = _name;
    available_range = _available_range;
  } // ctor

} // class PropertyError
