package subnetworkConnection;


/**
* subnetworkConnection/SubnetworkConnection_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

abstract public class SubnetworkConnection_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/SubnetworkConnection_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.SubnetworkConnection_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.SubnetworkConnection_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [14];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "userLabel",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "nativeEMSName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "owner",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.SNCState_THelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "sncState",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.ConnectionDirection_THelper.type ();
          _members0[5] = new org.omg.CORBA.StructMember (
            "direction",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "rate",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.StaticProtectionLevel_THelper.type ();
          _members0[7] = new org.omg.CORBA.StructMember (
            "staticProtectionLevel",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.SNCType_THelper.type ();
          _members0[8] = new org.omg.CORBA.StructMember (
            "sncType",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.TPData_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.TPDataList_THelper.id (), "TPDataList_T", _tcOf_members0);
          _members0[9] = new org.omg.CORBA.StructMember (
            "aEnd",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.TPData_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.TPDataList_THelper.id (), "TPDataList_T", _tcOf_members0);
          _members0[10] = new org.omg.CORBA.StructMember (
            "zEnd",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.Reroute_THelper.type ();
          _members0[11] = new org.omg.CORBA.StructMember (
            "rerouteAllowed",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.NetworkRouted_THelper.type ();
          _members0[12] = new org.omg.CORBA.StructMember (
            "networkRouted",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[13] = new org.omg.CORBA.StructMember (
            "additionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (subnetworkConnection.SubnetworkConnection_THelper.id (), "SubnetworkConnection_T", _members0);
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

  public static subnetworkConnection.SubnetworkConnection_T read (org.omg.CORBA.portable.InputStream istream)
  {
    subnetworkConnection.SubnetworkConnection_T value = new subnetworkConnection.SubnetworkConnection_T ();
    value.name = globaldefs.NVSList_THelper.read (istream);
    value.userLabel = istream.read_string ();
    value.nativeEMSName = istream.read_string ();
    value.owner = istream.read_string ();
    value.sncState = subnetworkConnection.SNCState_THelper.read (istream);
    value.direction = globaldefs.ConnectionDirection_THelper.read (istream);
    value.rate = istream.read_short ();
    value.staticProtectionLevel = subnetworkConnection.StaticProtectionLevel_THelper.read (istream);
    value.sncType = subnetworkConnection.SNCType_THelper.read (istream);
    value.aEnd = subnetworkConnection.TPDataList_THelper.read (istream);
    value.zEnd = subnetworkConnection.TPDataList_THelper.read (istream);
    value.rerouteAllowed = subnetworkConnection.Reroute_THelper.read (istream);
    value.networkRouted = subnetworkConnection.NetworkRouted_THelper.read (istream);
    value.additionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.SubnetworkConnection_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.name);
    ostream.write_string (value.userLabel);
    ostream.write_string (value.nativeEMSName);
    ostream.write_string (value.owner);
    subnetworkConnection.SNCState_THelper.write (ostream, value.sncState);
    globaldefs.ConnectionDirection_THelper.write (ostream, value.direction);
    ostream.write_short (value.rate);
    subnetworkConnection.StaticProtectionLevel_THelper.write (ostream, value.staticProtectionLevel);
    subnetworkConnection.SNCType_THelper.write (ostream, value.sncType);
    subnetworkConnection.TPDataList_THelper.write (ostream, value.aEnd);
    subnetworkConnection.TPDataList_THelper.write (ostream, value.zEnd);
    subnetworkConnection.Reroute_THelper.write (ostream, value.rerouteAllowed);
    subnetworkConnection.NetworkRouted_THelper.write (ostream, value.networkRouted);
    globaldefs.NVSList_THelper.write (ostream, value.additionalInfo);
  }

}
