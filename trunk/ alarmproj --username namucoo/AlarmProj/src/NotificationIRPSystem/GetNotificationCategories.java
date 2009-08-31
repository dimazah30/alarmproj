package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationCategories.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分30秒 CST
*/

public final class GetNotificationCategories extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetNotificationCategories ()
  {
    super(GetNotificationCategoriesHelper.id());
  } // ctor

  public GetNotificationCategories (String _reason)
  {
    super(GetNotificationCategoriesHelper.id());
    reason = _reason;
  } // ctor


  public GetNotificationCategories (String $reason, String _reason)
  {
    super(GetNotificationCategoriesHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetNotificationCategories
