package NotificationIRPSystem;


/**
* NotificationIRPSystem/AlreadySubscribed.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public final class AlreadySubscribed extends org.omg.CORBA.UserException
{

  public AlreadySubscribed ()
  {
    super(AlreadySubscribedHelper.id());
  } // ctor


  public AlreadySubscribed (String $reason)
  {
    super(AlreadySubscribedHelper.id() + "  " + $reason);
  } // ctor

} // class AlreadySubscribed
