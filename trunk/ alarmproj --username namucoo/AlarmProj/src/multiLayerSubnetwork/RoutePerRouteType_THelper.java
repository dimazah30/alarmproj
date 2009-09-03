package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/RoutePerRouteType_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * <p>The short sequence of routes, one per type (e.g. Intended and Current)</p>
   **/
abstract public class RoutePerRouteType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/multiLayerSubnetwork/RoutePerRouteType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, multiLayerSubnetwork.RouteAndRouteType_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static multiLayerSubnetwork.RouteAndRouteType_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = multiLayerSubnetwork.RouteAndRouteType_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (multiLayerSubnetwork.RoutePerRouteType_THelper.id (), "RoutePerRouteType_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static multiLayerSubnetwork.RouteAndRouteType_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    multiLayerSubnetwork.RouteAndRouteType_T value[] = null;
    int _len0 = istream.read_long ();
    value = new multiLayerSubnetwork.RouteAndRouteType_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = multiLayerSubnetwork.RouteAndRouteType_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, multiLayerSubnetwork.RouteAndRouteType_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      multiLayerSubnetwork.RouteAndRouteType_THelper.write (ostream, value[_i0]);
  }

}
