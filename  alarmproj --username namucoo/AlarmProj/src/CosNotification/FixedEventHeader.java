package CosNotification;


/**
* CosNotification/FixedEventHeader.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class FixedEventHeader implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.EventType event_type = null;
  public String event_name = null;

  public FixedEventHeader ()
  {
  } // ctor

  public FixedEventHeader (CosNotification.EventType _event_type, String _event_name)
  {
    event_type = _event_type;
    event_name = _event_name;
  } // ctor

} // class FixedEventHeader
