package NotificationIRPSystem;

/**
* NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupportedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��30�� CST
*/

public final class AtLeastOneNotificationCategoryNotSupportedHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported value = null;

  public AtLeastOneNotificationCategoryNotSupportedHolder ()
  {
  }

  public AtLeastOneNotificationCategoryNotSupportedHolder (NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.type ();
  }

}
