package CosNotification;


/**
* CosNotification/EventType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class EventType implements org.omg.CORBA.portable.IDLEntity
{
  public String domain_name = null;
  public String type_name = null;

  public EventType ()
  {
  } // ctor

  public EventType (String _domain_name, String _type_name)
  {
    domain_name = _domain_name;
    type_name = _type_name;
  } // ctor

} // class EventType
