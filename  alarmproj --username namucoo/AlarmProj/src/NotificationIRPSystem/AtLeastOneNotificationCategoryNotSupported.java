package NotificationIRPSystem;


/**
* NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupported.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分30秒 CST
*/

public final class AtLeastOneNotificationCategoryNotSupported extends org.omg.CORBA.UserException
{

  public AtLeastOneNotificationCategoryNotSupported ()
  {
    super(AtLeastOneNotificationCategoryNotSupportedHelper.id());
  } // ctor


  public AtLeastOneNotificationCategoryNotSupported (String $reason)
  {
    super(AtLeastOneNotificationCategoryNotSupportedHelper.id() + "  " + $reason);
  } // ctor

} // class AtLeastOneNotificationCategoryNotSupported
