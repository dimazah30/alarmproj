package NotificationIRPSystem;

/**
* NotificationIRPSystem/DetachExceptionHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��31�� ����һ ����09ʱ50��29�� CST
*/

public final class DetachExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPSystem.DetachException value = null;

  public DetachExceptionHolder ()
  {
  }

  public DetachExceptionHolder (NotificationIRPSystem.DetachException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPSystem.DetachExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPSystem.DetachExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPSystem.DetachExceptionHelper.type ();
  }

}
