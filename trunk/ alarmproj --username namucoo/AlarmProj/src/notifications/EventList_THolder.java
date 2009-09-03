package notifications;


/**
* notifications/EventList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>Sequence of CosNotification::StructuredEvent</p>
   **/
public final class EventList_THolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.StructuredEvent value[] = null;

  public EventList_THolder ()
  {
  }

  public EventList_THolder (CosNotification.StructuredEvent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.EventList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.EventList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.EventList_THelper.type ();
  }

}
