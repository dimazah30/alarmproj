package notifications;


/**
* notifications/CorrelatedNotifications_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
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
