package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetNotificationCategoriesHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��29�� CST
*/

public final class GetNotificationCategoriesHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetNotificationCategories value = null;

  public GetNotificationCategoriesHolder ()
  {
  }

  public GetNotificationCategoriesHolder (NotificationIRPSystem.GetNotificationCategories initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetNotificationCategoriesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetNotificationCategoriesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetNotificationCategoriesHelper.type ();
  }

}
