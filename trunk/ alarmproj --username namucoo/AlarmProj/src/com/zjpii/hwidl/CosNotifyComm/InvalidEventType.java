package CosNotifyComm;


/**
* CosNotifyComm/InvalidEventType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/

public final class InvalidEventType extends org.omg.CORBA.UserException
{
  public CosNotification.EventType type = null;

  public InvalidEventType ()
  {
    super(InvalidEventTypeHelper.id());
  } // ctor

  public InvalidEventType (CosNotification.EventType _type)
  {
    super(InvalidEventTypeHelper.id());
    type = _type;
  } // ctor


  public InvalidEventType (String $reason, CosNotification.EventType _type)
  {
    super(InvalidEventTypeHelper.id() + "  " + $reason);
    type = _type;
  } // ctor

} // class InvalidEventType
