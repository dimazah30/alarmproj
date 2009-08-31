package NotificationIRPSystem;

/**
* NotificationIRPSystem/AlreadySubscribedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class AlreadySubscribedHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.AlreadySubscribed value = null;

  public AlreadySubscribedHolder ()
  {
  }

  public AlreadySubscribedHolder (NotificationIRPSystem.AlreadySubscribed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.AlreadySubscribedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.AlreadySubscribedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.AlreadySubscribedHelper.type ();
  }

}
