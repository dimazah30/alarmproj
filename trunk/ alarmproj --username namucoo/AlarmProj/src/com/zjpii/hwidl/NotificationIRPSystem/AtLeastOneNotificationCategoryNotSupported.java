package NotificationIRPSystem;


/**
* NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupported.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
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
