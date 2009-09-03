package subnetworkConnection;


/**
* subnetworkConnection/NetworkRouted_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Network routed, indicates if the route must be or is computed and
   * implemented at the network level. NR_YES indicates that the
   * route must be / is computed at the network. NR_NO indicates that the route 
   * must not be / is not computed at the network. NR_NA indicates that the 
   * route can be computed anywhere.</p>
   * 
   * <p>If rerouting is allowed, this attribute will indicate who last rerouted 
   * the SNC, the network (NR_YES) or the EMS (NR_NO).</p>
   **/
abstract public class NetworkRouted_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/NetworkRouted_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.NetworkRouted_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.NetworkRouted_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (subnetworkConnection.NetworkRouted_THelper.id (), "NetworkRouted_T", new String[] { "NR_NA", "NR_NO", "NR_YES"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.NetworkRouted_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return subnetworkConnection.NetworkRouted_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.NetworkRouted_T value)
  {
    ostream.write_long (value.value ());
  }

}
