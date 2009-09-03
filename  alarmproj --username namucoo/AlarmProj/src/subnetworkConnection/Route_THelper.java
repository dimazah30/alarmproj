package subnetworkConnection;


/**
* subnetworkConnection/Route_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>A route for an SNC is defined as a partially ordered list of cross-
   * connects.</p>
   *
   * <p>This structure can deal with any arbitrarily complex protection paths
   * made up from connection types described in
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   * 
   * <p>The cross-connects are listed from the NE 
   * on which the SNC starts (first entry) to the NE on which the SNC ends
   * (last entry). There is no mandatory order in
   * the cross-connects listed in between the first one and the last one.</p>
   **/
abstract public class Route_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/Route_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.CrossConnect_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.CrossConnect_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = subnetworkConnection.CrossConnect_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.Route_THelper.id (), "Route_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.CrossConnect_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    subnetworkConnection.CrossConnect_T value[] = null;
    int _len0 = istream.read_long ();
    value = new subnetworkConnection.CrossConnect_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = subnetworkConnection.CrossConnect_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.CrossConnect_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      subnetworkConnection.CrossConnect_THelper.write (ostream, value[_i0]);
  }

}
