package notifications;


/**
* notifications/CorrelatedNotificationList_THelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
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
abstract public class CorrelatedNotificationList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/CorrelatedNotificationList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.CorrelatedNotifications_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.CorrelatedNotifications_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = notifications.CorrelatedNotifications_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (notifications.CorrelatedNotificationList_THelper.id (), "CorrelatedNotificationList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.CorrelatedNotifications_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    notifications.CorrelatedNotifications_T value[] = null;
    int _len0 = istream.read_long ();
    value = new notifications.CorrelatedNotifications_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = notifications.CorrelatedNotifications_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.CorrelatedNotifications_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      notifications.CorrelatedNotifications_THelper.write (ostream, value[_i0]);
  }

}
