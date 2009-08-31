package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/SubscriptionIdSetHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��11�� CST
*/

public final class SubscriptionIdSetHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public SubscriptionIdSetHolder ()
  {
  }

  public SubscriptionIdSetHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.SubscriptionIdSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.SubscriptionIdSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.SubscriptionIdSetHelper.type ();
  }

}
