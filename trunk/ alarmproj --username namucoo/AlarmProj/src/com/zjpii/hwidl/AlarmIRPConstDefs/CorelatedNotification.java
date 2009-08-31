package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/CorelatedNotification.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

public final class CorelatedNotification implements org.omg.CORBA.portable.IDLEntity
{
  public String source = null;

  // of the Structured Event, i.e., the notification.
  public int notif_id_set[] = null;

  public CorelatedNotification ()
  {
  } // ctor

  public CorelatedNotification (String _source, int[] _notif_id_set)
  {
    source = _source;
    notif_id_set = _notif_id_set;
  } // ctor

} // class CorelatedNotification
