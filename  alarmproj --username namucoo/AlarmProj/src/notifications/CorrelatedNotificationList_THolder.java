package notifications;


/**
* notifications/CorrelatedNotificationList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p> The optional "X.733::CorrelatedNotifications" parameter uses this 
   * type.</p>
   *
   * <p>When present in an alarm notification, it contains a set of 
   * notification identifiers and, if necessary, their associated 
   * object names.  This set is defined to be the set of all notifications 
   * to which this notification is considered to be correlated.
   * This is consistent with the ITU-T X.733 definition.</p>
   **/
public final class CorrelatedNotificationList_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.CorrelatedNotifications_T value[] = null;

  public CorrelatedNotificationList_THolder ()
  {
  }

  public CorrelatedNotificationList_THolder (notifications.CorrelatedNotifications_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.CorrelatedNotificationList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.CorrelatedNotificationList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.CorrelatedNotificationList_THelper.type ();
  }

}
