package subnetworkConnection;


/**
* subnetworkConnection/Reroute_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The Reroute_T type indicates if the EMS/Mes/Control Plane are allowed 
   * and/or required to reroute this SNC if there 
   * is a failure on this SNC, periodically to optimize the routes, of for any 
   * other reason. This can be done either using network routing protocols or
   * through centralized management..</p>
   *
   * <p>The RR_NO value means that the EMS/MEs/Control Plane are not allowed to
   * reroute the 
   * SNC. The RR_YES value means that the EMS/MEs are allowed to reroute the SNC 
   * and required to attempt to reroute it upon failure.
   * The RR_NA value is used when the NMS does not want to specify the exact EMS 
   * behaviour. In this case it is left up to the EMS/MEs/Control Plane to
   * decide whether rerouting will be provided. It is also used if the
   * EMS/Mes/Control Plane are allowed to 
   * reroute the SNC but not required to attempt to reroute it upon failure.</p>
   **/
abstract public class Reroute_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/Reroute_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.Reroute_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.Reroute_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (subnetworkConnection.Reroute_THelper.id (), "Reroute_T", new String[] { "RR_NA", "RR_NO", "RR_YES"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.Reroute_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return subnetworkConnection.Reroute_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.Reroute_T value)
  {
    ostream.write_long (value.value ());
  }

}
