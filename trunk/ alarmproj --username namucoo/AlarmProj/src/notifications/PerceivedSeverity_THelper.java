package notifications;


/**
* notifications/PerceivedSeverity_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>The PerceivedSeverity_T values are consistent
   * with ITU-T X.733 definitions.</p>
   * 
   **/
abstract public class PerceivedSeverity_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/PerceivedSeverity_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.PerceivedSeverity_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.PerceivedSeverity_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (notifications.PerceivedSeverity_THelper.id (), "PerceivedSeverity_T", new String[] { "PS_INDETERMINATE", "PS_CRITICAL", "PS_MAJOR", "PS_MINOR", "PS_WARNING", "PS_CLEARED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.PerceivedSeverity_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return notifications.PerceivedSeverity_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.PerceivedSeverity_T value)
  {
    ostream.write_long (value.value ());
  }

}
