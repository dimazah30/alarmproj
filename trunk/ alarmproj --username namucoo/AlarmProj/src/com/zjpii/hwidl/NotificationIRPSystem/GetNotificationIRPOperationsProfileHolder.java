package NotificationIRPSystem;

/**
* NotificationIRPSystem/GetNotificationIRPOperationsProfileHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class GetNotificationIRPOperationsProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.GetNotificationIRPOperationsProfile value = null;

  public GetNotificationIRPOperationsProfileHolder ()
  {
  }

  public GetNotificationIRPOperationsProfileHolder (NotificationIRPSystem.GetNotificationIRPOperationsProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.GetNotificationIRPOperationsProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.GetNotificationIRPOperationsProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.GetNotificationIRPOperationsProfileHelper.type ();
  }

}
