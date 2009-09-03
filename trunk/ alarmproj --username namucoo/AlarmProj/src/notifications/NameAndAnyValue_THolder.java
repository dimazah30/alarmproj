package notifications;

/**
* notifications/NameAndAnyValue_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/

public final class NameAndAnyValue_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.NameAndAnyValue_T value = null;

  public NameAndAnyValue_THolder ()
  {
  }

  public NameAndAnyValue_THolder (notifications.NameAndAnyValue_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.NameAndAnyValue_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.NameAndAnyValue_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.NameAndAnyValue_THelper.type ();
  }

}
