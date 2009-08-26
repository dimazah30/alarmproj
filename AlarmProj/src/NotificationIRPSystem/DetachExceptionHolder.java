package NotificationIRPSystem;

/**
* NotificationIRPSystem/DetachExceptionHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
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
