package NotificationIRPSystem;


/**
* NotificationIRPSystem/AlreadySubscribed.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分30秒 CST
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
