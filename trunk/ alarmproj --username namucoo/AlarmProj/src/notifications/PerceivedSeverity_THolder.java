package notifications;

/**
* notifications/PerceivedSeverity_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>The PerceivedSeverity_T values are consistent
   * with ITU-T X.733 definitions.</p>
   * 
   **/
public final class PerceivedSeverity_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.PerceivedSeverity_T value = null;

  public PerceivedSeverity_THolder ()
  {
  }

  public PerceivedSeverity_THolder (notifications.PerceivedSeverity_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.PerceivedSeverity_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.PerceivedSeverity_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.PerceivedSeverity_THelper.type ();
  }

}
