package notifications;


/**
* notifications/AlarmOrTCAIdentifier_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/

abstract public class AlarmOrTCAIdentifier_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/AlarmOrTCAIdentifier_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.AlarmOrTCAIdentifier_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.AlarmOrTCAIdentifier_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      org.omg.CORBA.TypeCode _disTypeCode0;
      _disTypeCode0 = notifications.AlarmTypeQualifier_THelper.type ();
      org.omg.CORBA.UnionMember[] _members0 = new org.omg.CORBA.UnionMember [2];
      org.omg.CORBA.TypeCode _tcOf_members0;
      org.omg.CORBA.Any _anyOf_members0;

      // Branch for alarmId (case label ALARM)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      notifications.AlarmTypeQualifier_THelper.insert (_anyOf_members0, notifications.AlarmTypeQualifier_T.ALARM);
      _tcOf_members0 = notifications.AlarmId_THelper.type ();
      _members0[0] = new org.omg.CORBA.UnionMember (
        "alarmId",
        _anyOf_members0,
        _tcOf_members0,
        null);

      // Branch for tcaId (case label TCA)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      notifications.AlarmTypeQualifier_THelper.insert (_anyOf_members0, notifications.AlarmTypeQualifier_T.TCA);
      _tcOf_members0 = notifications.TCAId_THelper.type ();
      _members0[1] = new org.omg.CORBA.UnionMember (
        "tcaId",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (notifications.AlarmOrTCAIdentifier_THelper.id (), "AlarmOrTCAIdentifier_T", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.AlarmOrTCAIdentifier_T read (org.omg.CORBA.portable.InputStream istream)
  {
    notifications.AlarmOrTCAIdentifier_T value = new notifications.AlarmOrTCAIdentifier_T ();
    notifications.AlarmTypeQualifier_T _dis0 = null;
    _dis0 = notifications.AlarmTypeQualifier_THelper.read (istream);
    switch (_dis0.value ())
    {
      case notifications.AlarmTypeQualifier_T._ALARM:
        notifications.AlarmId_T _alarmId = null;
        _alarmId = notifications.AlarmId_THelper.read (istream);
        value.alarmId (_alarmId);
        break;
      case notifications.AlarmTypeQualifier_T._TCA:
        notifications.TCAId_T _tcaId = null;
        _tcaId = notifications.TCAId_THelper.read (istream);
        value.tcaId (_tcaId);
        break;
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.AlarmOrTCAIdentifier_T value)
  {
    notifications.AlarmTypeQualifier_THelper.write (ostream, value.discriminator ());
    switch (value.discriminator ().value ())
    {
      case notifications.AlarmTypeQualifier_T._ALARM:
        notifications.AlarmId_THelper.write (ostream, value.alarmId ());
        break;
      case notifications.AlarmTypeQualifier_T._TCA:
        notifications.TCAId_THelper.write (ostream, value.tcaId ());
        break;
    }
  }

}
