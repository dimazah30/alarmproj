package NotificationIRPSystem;


/**
* NotificationIRPSystem/Attach.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public final class Attach extends org.omg.CORBA.UserException
{
  public String reason = null;

  public Attach ()
  {
    super(AttachHelper.id());
  } // ctor

  public Attach (String _reason)
  {
    super(AttachHelper.id());
    reason = _reason;
  } // ctor


  public Attach (String $reason, String _reason)
  {
    super(AttachHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class Attach
