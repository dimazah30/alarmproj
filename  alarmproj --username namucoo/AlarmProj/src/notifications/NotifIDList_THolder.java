package notifications;


/**
* notifications/NotifIDList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>List of notification IDs (field notificationId in the 
   * notifications).</p>
   **/
public final class NotifIDList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public NotifIDList_THolder ()
  {
  }

  public NotifIDList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.NotifIDList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.NotifIDList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.NotifIDList_THelper.type ();
  }

}
