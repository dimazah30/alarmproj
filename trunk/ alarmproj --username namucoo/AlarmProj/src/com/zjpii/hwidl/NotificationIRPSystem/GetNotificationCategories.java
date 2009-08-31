package NotificationIRPSystem;


/**
* NotificationIRPSystem/GetNotificationCategories.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
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
