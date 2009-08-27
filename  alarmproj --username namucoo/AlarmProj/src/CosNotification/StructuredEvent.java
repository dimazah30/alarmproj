package CosNotification;


/**
* CosNotification/StructuredEvent.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class StructuredEvent implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.EventHeader header = null;
  public CosNotification.Property filterable_data[] = null;
  public org.omg.CORBA.Any remainder_of_body = null;

  public StructuredEvent ()
  {
  } // ctor

  public StructuredEvent (CosNotification.EventHeader _header, CosNotification.Property[] _filterable_data, org.omg.CORBA.Any _remainder_of_body)
  {
    header = _header;
    filterable_data = _filterable_data;
    remainder_of_body = _remainder_of_body;
  } // ctor

} // class StructuredEvent
