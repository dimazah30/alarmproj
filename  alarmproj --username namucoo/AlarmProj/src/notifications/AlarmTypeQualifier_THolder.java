package notifications;

/**
* notifications/AlarmTypeQualifier_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>Used to distinguish TCA from alarm.</p> 
   **/
public final class AlarmTypeQualifier_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.AlarmTypeQualifier_T value = null;

  public AlarmTypeQualifier_THolder ()
  {
  }

  public AlarmTypeQualifier_THolder (notifications.AlarmTypeQualifier_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.AlarmTypeQualifier_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.AlarmTypeQualifier_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.AlarmTypeQualifier_THelper.type ();
  }

}
