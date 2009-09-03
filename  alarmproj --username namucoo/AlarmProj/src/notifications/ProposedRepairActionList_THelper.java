package notifications;


/**
* notifications/ProposedRepairActionList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p> The optional "X.733::ProposedRepairActions" parameter uses this 
   * type.</p>
   *
   * <p>When present in an alarm notification, it
   * indicates if the cause is known and the system being managed 
   * can suggest one or more solutions (such as switch in standby equipment, 
   * retry, replace media).
   * This is consistent with the ITU-T X.733 definition. </p>
   **/
abstract public class ProposedRepairActionList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/ProposedRepairActionList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (notifications.ProposedRepairAction_THelper.id (), "ProposedRepairAction_T", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (notifications.ProposedRepairActionList_THelper.id (), "ProposedRepairActionList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String[] read (org.omg.CORBA.portable.InputStream istream)
  {
    String value[] = null;
    int _len0 = istream.read_long ();
    value = new String[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = notifications.ProposedRepairAction_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      notifications.ProposedRepairAction_THelper.write (ostream, value[_i0]);
  }

}
