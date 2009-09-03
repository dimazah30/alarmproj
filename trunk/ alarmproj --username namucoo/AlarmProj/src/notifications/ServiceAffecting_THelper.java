package notifications;


/**
* notifications/ServiceAffecting_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>ServiceAffecting_T describes the impact of a fault on monitored 
   * entities</p>
   * <br>SA_UNKNOWN: The EMS cannot determine if the condition 
   *  affects service or not.<br>
   * <br>SA_SERVICE_AFFECTING: The EMS determines that the condition affects 
   * service.<br>
   * <br>SA_NON_SERVICE_AFFECTING: The EMS determines that the condition does 
   *  not affect service.<br>
   **/
abstract public class ServiceAffecting_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/ServiceAffecting_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.ServiceAffecting_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.ServiceAffecting_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (notifications.ServiceAffecting_THelper.id (), "ServiceAffecting_T", new String[] { "SA_UNKNOWN", "SA_SERVICE_AFFECTING", "SA_NON_SERVICE_AFFECTING"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.ServiceAffecting_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return notifications.ServiceAffecting_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.ServiceAffecting_T value)
  {
    ostream.write_long (value.value ());
  }

}
