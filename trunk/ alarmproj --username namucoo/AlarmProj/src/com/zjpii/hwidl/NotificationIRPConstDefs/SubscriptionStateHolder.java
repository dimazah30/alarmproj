package NotificationIRPConstDefs;

/**
* NotificationIRPConstDefs/SubscriptionStateHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��11�� CST
*/


/*
   This indicates if the subscription is Active (not suspended), Suspended,
   or Invalid.
   */
public final class SubscriptionStateHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPConstDefs.SubscriptionState value = null;

  public SubscriptionStateHolder ()
  {
  }

  public SubscriptionStateHolder (NotificationIRPConstDefs.SubscriptionState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.SubscriptionStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.SubscriptionStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.SubscriptionStateHelper.type ();
  }

}
