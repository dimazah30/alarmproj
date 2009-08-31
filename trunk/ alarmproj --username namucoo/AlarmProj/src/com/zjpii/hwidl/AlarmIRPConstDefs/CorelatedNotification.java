package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/CorelatedNotification.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
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
