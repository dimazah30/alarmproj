package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetSubscriptionIdsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��30�� CST
*/

public final class GetSubscriptionIdsHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetSubscriptionIds value = null;

  public GetSubscriptionIdsHolder ()
  {
  }

  public GetSubscriptionIdsHolder (NotificationIRPSystem.GetSubscriptionIds initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetSubscriptionIdsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetSubscriptionIdsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetSubscriptionIdsHelper.type ();
  }

}
