package callSNC;


/**
* callSNC/SNCAndRoute_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

abstract public class SNCAndRoute_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/SNCAndRoute_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.SNCAndRoute_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.SNCAndRoute_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = subnetworkConnection.SubnetworkConnection_THelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "connection",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.RouteDescriptor_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.RouteList_THelper.id (), "RouteList_T", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "connectionRoutes",
            _tcOf_members0,
            null);
          _tcOf_members0 = mLSNPPLink.MultiLayerSNPPLink_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPPLink.MLSNPPLinkList_THelper.id (), "MLSNPPLinkList_T", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "edgeMLSNPPLinks",
            _tcOf_members0,
            null);
          _tcOf_members0 = mLSNPPLink.MultiLayerSNPPLink_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPPLink.MLSNPPLinkList_THelper.id (), "MLSNPPLinkList_T", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "internalMLSNPPLinks",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.RouteType_THelper.id (), "RouteType_T", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "routeType",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (callSNC.SNCAndRoute_THelper.id (), "SNCAndRoute_T", _members0);
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

  public static callSNC.SNCAndRoute_T read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.SNCAndRoute_T value = new callSNC.SNCAndRoute_T ();
    value.connection = subnetworkConnection.SubnetworkConnection_THelper.read (istream);
    value.connectionRoutes = subnetworkConnection.RouteList_THelper.read (istream);
    value.edgeMLSNPPLinks = mLSNPPLink.MLSNPPLinkList_THelper.read (istream);
    value.internalMLSNPPLinks = mLSNPPLink.MLSNPPLinkList_THelper.read (istream);
    value.routeType = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.SNCAndRoute_T value)
  {
    subnetworkConnection.SubnetworkConnection_THelper.write (ostream, value.connection);
    subnetworkConnection.RouteList_THelper.write (ostream, value.connectionRoutes);
    mLSNPPLink.MLSNPPLinkList_THelper.write (ostream, value.edgeMLSNPPLinks);
    mLSNPPLink.MLSNPPLinkList_THelper.write (ostream, value.internalMLSNPPLinks);
    ostream.write_string (value.routeType);
  }

}
