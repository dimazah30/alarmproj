package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/NotificationTypePerNotificationCategoryHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��11�� CST
*/


/*
   It defines the notification types of a particular notification category.
   */
public final class NotificationTypePerNotificationCategoryHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public NotificationTypePerNotificationCategoryHolder ()
  {
  }

  public NotificationTypePerNotificationCategoryHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.NotificationTypePerNotificationCategoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.NotificationTypePerNotificationCategoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.NotificationTypePerNotificationCategoryHelper.type ();
  }

}
