package subnetworkConnection;


/**
* subnetworkConnection/SNCModifyData_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

abstract public class SNCModifyData_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/SNCModifyData_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.SNCModifyData_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.SNCModifyData_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [21];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "userLabel",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[1] = new org.omg.CORBA.StructMember (
            "forceUniqueness",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "owner",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.ConnectionDirection_THelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "direction",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "modifyType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[5] = new org.omg.CORBA.StructMember (
            "retainOldSNC",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[6] = new org.omg.CORBA.StructMember (
            "modifyServers_allowed",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.StaticProtectionLevel_THelper.type ();
          _members0[7] = new org.omg.CORBA.StructMember (
            "staticProtectionLevel",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.ProtectionEffort_THelper.type ();
          _members0[8] = new org.omg.CORBA.StructMember (
            "protectionEffort",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.Reroute_THelper.type ();
          _members0[9] = new org.omg.CORBA.StructMember (
            "rerouteAllowed",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.NetworkRouted_THelper.type ();
          _members0[10] = new org.omg.CORBA.StructMember (
            "networkRouted",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.SNCType_THelper.type ();
          _members0[11] = new org.omg.CORBA.StructMember (
            "sncType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", _tcOf_members0);
          _members0[12] = new org.omg.CORBA.StructMember (
            "layerRate",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.RouteDescriptor_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.RouteList_THelper.id (), "RouteList_T", _tcOf_members0);
          _members0[13] = new org.omg.CORBA.StructMember (
            "addedOrNewRoute",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.RouteDescriptor_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.RouteList_THelper.id (), "RouteList_T", _tcOf_members0);
          _members0[14] = new org.omg.CORBA.StructMember (
            "removedRoute",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.Resource_THelper.id (), "Resource_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.ResourceList_THelper.id (), "ResourceList_T", _tcOf_members0);
          _members0[15] = new org.omg.CORBA.StructMember (
            "neTpInclusions",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[16] = new org.omg.CORBA.StructMember (
            "fullRoute",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.Resource_THelper.id (), "Resource_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.ResourceList_THelper.id (), "ResourceList_T", _tcOf_members0);
          _members0[17] = new org.omg.CORBA.StructMember (
            "neTpSncExclusions",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributesList_THelper.id (), "NamingAttributesList_T", _tcOf_members0);
          _members0[18] = new org.omg.CORBA.StructMember (
            "aEnd",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributesList_THelper.id (), "NamingAttributesList_T", _tcOf_members0);
          _members0[19] = new org.omg.CORBA.StructMember (
            "zEnd",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[20] = new org.omg.CORBA.StructMember (
            "additionalCreationInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (subnetworkConnection.SNCModifyData_THelper.id (), "SNCModifyData_T", _members0);
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

  public static subnetworkConnection.SNCModifyData_T read (org.omg.CORBA.portable.InputStream istream)
  {
    subnetworkConnection.SNCModifyData_T value = new subnetworkConnection.SNCModifyData_T ();
    value.userLabel = istream.read_string ();
    value.forceUniqueness = istream.read_boolean ();
    value.owner = istream.read_string ();
    value.direction = globaldefs.ConnectionDirection_THelper.read (istream);
    value.modifyType = istream.read_string ();
    value.retainOldSNC = istream.read_boolean ();
    value.modifyServers_allowed = istream.read_boolean ();
    value.staticProtectionLevel = subnetworkConnection.StaticProtectionLevel_THelper.read (istream);
    value.protectionEffort = subnetworkConnection.ProtectionEffort_THelper.read (istream);
    value.rerouteAllowed = subnetworkConnection.Reroute_THelper.read (istream);
    value.networkRouted = subnetworkConnection.NetworkRouted_THelper.read (istream);
    value.sncType = subnetworkConnection.SNCType_THelper.read (istream);
    value.layerRate = istream.read_short ();
    value.addedOrNewRoute = subnetworkConnection.RouteList_THelper.read (istream);
    value.removedRoute = subnetworkConnection.RouteList_THelper.read (istream);
    value.neTpInclusions = subnetworkConnection.ResourceList_THelper.read (istream);
    value.fullRoute = istream.read_boolean ();
    value.neTpSncExclusions = subnetworkConnection.ResourceList_THelper.read (istream);
    value.aEnd = globaldefs.NamingAttributesList_THelper.read (istream);
    value.zEnd = globaldefs.NamingAttributesList_THelper.read (istream);
    value.additionalCreationInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.SNCModifyData_T value)
  {
    ostream.write_string (value.userLabel);
    ostream.write_boolean (value.forceUniqueness);
    ostream.write_string (value.owner);
    globaldefs.ConnectionDirection_THelper.write (ostream, value.direction);
    ostream.write_string (value.modifyType);
    ostream.write_boolean (value.retainOldSNC);
    ostream.write_boolean (value.modifyServers_allowed);
    subnetworkConnection.StaticProtectionLevel_THelper.write (ostream, value.staticProtectionLevel);
    subnetworkConnection.ProtectionEffort_THelper.write (ostream, value.protectionEffort);
    subnetworkConnection.Reroute_THelper.write (ostream, value.rerouteAllowed);
    subnetworkConnection.NetworkRouted_THelper.write (ostream, value.networkRouted);
    subnetworkConnection.SNCType_THelper.write (ostream, value.sncType);
    ostream.write_short (value.layerRate);
    subnetworkConnection.RouteList_THelper.write (ostream, value.addedOrNewRoute);
    subnetworkConnection.RouteList_THelper.write (ostream, value.removedRoute);
    subnetworkConnection.ResourceList_THelper.write (ostream, value.neTpInclusions);
    ostream.write_boolean (value.fullRoute);
    subnetworkConnection.ResourceList_THelper.write (ostream, value.neTpSncExclusions);
    globaldefs.NamingAttributesList_THelper.write (ostream, value.aEnd);
    globaldefs.NamingAttributesList_THelper.write (ostream, value.zEnd);
    globaldefs.NVSList_THelper.write (ostream, value.additionalCreationInfo);
  }

}
