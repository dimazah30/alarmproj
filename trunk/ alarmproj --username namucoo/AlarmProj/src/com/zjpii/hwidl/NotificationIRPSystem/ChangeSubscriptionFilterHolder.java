package NotificationIRPSystem;

/**
* NotificationIRPSystem/ChangeSubscriptionFilterHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class ChangeSubscriptionFilterHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.ChangeSubscriptionFilter value = null;

  public ChangeSubscriptionFilterHolder ()
  {
  }

  public ChangeSubscriptionFilterHolder (NotificationIRPSystem.ChangeSubscriptionFilter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.ChangeSubscriptionFilterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.ChangeSubscriptionFilterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.ChangeSubscriptionFilterHelper.type ();
  }

}
