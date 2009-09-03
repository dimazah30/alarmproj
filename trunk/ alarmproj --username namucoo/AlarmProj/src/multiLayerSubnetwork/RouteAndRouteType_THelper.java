package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/RouteAndRouteType_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/

abstract public class RouteAndRouteType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/multiLayerSubnetwork/RouteAndRouteType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, multiLayerSubnetwork.RouteAndRouteType_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static multiLayerSubnetwork.RouteAndRouteType_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (multiLayerSubnetwork.RAIDList_THelper.id (), "RAIDList_T", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "rAIDList",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.RouteType_THelper.id (), "RouteType_T", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "routeType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "RouteDescription",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (multiLayerSubnetwork.RouteAndRouteType_THelper.id (), "RouteAndRouteType_T", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static multiLayerSubnetwork.RouteAndRouteType_T read (org.omg.CORBA.portable.InputStream istream)
  {
    multiLayerSubnetwork.RouteAndRouteType_T value = new multiLayerSubnetwork.RouteAndRouteType_T ();
    value.rAIDList = multiLayerSubnetwork.RAIDList_THelper.read (istream);
    value.routeType = istream.read_string ();
    value.RouteDescription = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, multiLayerSubnetwork.RouteAndRouteType_T value)
  {
    multiLayerSubnetwork.RAIDList_THelper.write (ostream, value.rAIDList);
    ostream.write_string (value.routeType);
    ostream.write_string (value.RouteDescription);
  }

}
