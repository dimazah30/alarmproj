package NotificationIRPSystem;

/**
* NotificationIRPSystem/NotificationIRPHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class NotificationIRPHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.NotificationIRP value = null;

  public NotificationIRPHolder ()
  {
  }

  public NotificationIRPHolder (NotificationIRPSystem.NotificationIRP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.NotificationIRPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.NotificationIRPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.NotificationIRPHelper.type ();
  }

}
