package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetSubscriptionStatusHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class GetSubscriptionStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetSubscriptionStatus value = null;

  public GetSubscriptionStatusHolder ()
  {
  }

  public GetSubscriptionStatusHolder (NotificationIRPSystem.GetSubscriptionStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetSubscriptionStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetSubscriptionStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetSubscriptionStatusHelper.type ();
  }

}
