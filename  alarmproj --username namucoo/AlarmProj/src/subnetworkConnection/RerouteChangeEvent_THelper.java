package subnetworkConnection;


/**
* subnetworkConnection/RerouteChangeEvent_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/** 
   * <p>The route change goes through different stages during a
   * reroute of a SubnetworkConnection. These stages are a part
   * of the ROUTE_CHANGE notification.
   * These are:
   * <ol>
   * <li> "RerouteStarted" </li>
   * <li> "RerouteCompleted" </li>
   * <li> "RerouteFailed" </li>
   * <li> "RouteAdded", raised only when the addRoute operation is 
   * successful</li>
   * <li>"RouteRemoved", raised only when the removeRoute operation is 
   * successful</li>
   * <li> "RouteActivated", raised only when the switchRoute operation is 
   * successful</li>
   * <li> "RouteDeactivated", raised only when the switchRoute is 
   * successful</li>
   * <li> "RouteSetToIntended", raised only when the setIntendedRoute operation 
   * is successful</li>
   * </ol></p>
   **/
abstract public class RerouteChangeEvent_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/RerouteChangeEvent_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.RerouteChangeEvent_THelper.id (), "RerouteChangeEvent_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_string (value);
  }

}
