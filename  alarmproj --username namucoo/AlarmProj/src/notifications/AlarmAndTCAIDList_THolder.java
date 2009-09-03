package notifications;


/**
* notifications/AlarmAndTCAIDList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>Sequence of identifiers for alarms and TCAs. </p>
   **/
public final class AlarmAndTCAIDList_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.AlarmOrTCAIdentifier_T value[] = null;

  public AlarmAndTCAIDList_THolder ()
  {
  }

  public AlarmAndTCAIDList_THolder (notifications.AlarmOrTCAIdentifier_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.AlarmAndTCAIDList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.AlarmAndTCAIDList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.AlarmAndTCAIDList_THelper.type ();
  }

}
