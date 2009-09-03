package subnetworkConnection;


/**
* subnetworkConnection/RouteDescriptor_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

abstract public class RouteDescriptor_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/RouteDescriptor_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.RouteDescriptor_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.RouteDescriptor_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [8];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "intended",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "actualState",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "administrativeState",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "inUseBy",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "exclusive",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.CrossConnect_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.Route_THelper.id (), "Route_T", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "routeXCs",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[7] = new org.omg.CORBA.StructMember (
            "additionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (subnetworkConnection.RouteDescriptor_THelper.id (), "RouteDescriptor_T", _members0);
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

  public static subnetworkConnection.RouteDescriptor_T read (org.omg.CORBA.portable.InputStream istream)
  {
    subnetworkConnection.RouteDescriptor_T value = new subnetworkConnection.RouteDescriptor_T ();
    value.id = istream.read_string ();
    value.intended = istream.read_string ();
    value.actualState = istream.read_string ();
    value.administrativeState = istream.read_string ();
    value.inUseBy = istream.read_string ();
    value.exclusive = istream.read_string ();
    value.routeXCs = subnetworkConnection.Route_THelper.read (istream);
    value.additionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.RouteDescriptor_T value)
  {
    ostream.write_string (value.id);
    ostream.write_string (value.intended);
    ostream.write_string (value.actualState);
    ostream.write_string (value.administrativeState);
    ostream.write_string (value.inUseBy);
    ostream.write_string (value.exclusive);
    subnetworkConnection.Route_THelper.write (ostream, value.routeXCs);
    globaldefs.NVSList_THelper.write (ostream, value.additionalInfo);
  }

}
