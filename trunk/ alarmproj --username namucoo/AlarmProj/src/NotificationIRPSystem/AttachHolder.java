package NotificationIRPSystem;

/**
* NotificationIRPSystem/AttachHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��29�� CST
*/

public final class AttachHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.Attach value = null;

  public AttachHolder ()
  {
  }

  public AttachHolder (NotificationIRPSystem.Attach initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.AttachHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.AttachHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.AttachHelper.type ();
  }

}
