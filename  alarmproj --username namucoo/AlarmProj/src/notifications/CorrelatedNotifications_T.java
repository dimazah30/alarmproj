package notifications;


/**
* notifications/CorrelatedNotifications_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/

public final class CorrelatedNotifications_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T source[] = null;
  public String notifIDs[] = null;

  public CorrelatedNotifications_T ()
  {
  } // ctor

  public CorrelatedNotifications_T (globaldefs.NameAndStringValue_T[] _source, String[] _notifIDs)
  {
    source = _source;
    notifIDs = _notifIDs;
  } // ctor

} // class CorrelatedNotifications_T
