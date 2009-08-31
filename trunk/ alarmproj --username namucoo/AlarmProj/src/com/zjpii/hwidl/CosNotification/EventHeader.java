package CosNotification;


/**
* CosNotification/EventHeader.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class EventHeader implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.FixedEventHeader fixed_header = null;
  public CosNotification.Property variable_header[] = null;

  public EventHeader ()
  {
  } // ctor

  public EventHeader (CosNotification.FixedEventHeader _fixed_header, CosNotification.Property[] _variable_header)
  {
    fixed_header = _fixed_header;
    variable_header = _variable_header;
  } // ctor

} // class EventHeader
