package subnetworkConnection;


/**
* subnetworkConnection/RouteCreateData_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

abstract public class RouteCreateData_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/RouteCreateData_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.RouteCreateData_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.RouteCreateData_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [7];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "intended",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "exclusive",
            _tcOf_members0,
            null);
          _tcOf_members0 = subnetworkConnection.CrossConnect_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.CrossConnectList_THelper.id (), "CrossConnectList_T", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "ccInclusions",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.Resource_THelper.id (), "Resource_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.ResourceList_THelper.id (), "ResourceList_T", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "neTpInclusions",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[4] = new org.omg.CORBA.StructMember (
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
          _members0[5] = new org.omg.CORBA.StructMember (
            "neTpSncExclusions",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "additionalCreationInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (subnetworkConnection.RouteCreateData_THelper.id (), "RouteCreateData_T", _members0);
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

  public static subnetworkConnection.RouteCreateData_T read (org.omg.CORBA.portable.InputStream istream)
  {
    subnetworkConnection.RouteCreateData_T value = new subnetworkConnection.RouteCreateData_T ();
    value.intended = istream.read_string ();
    value.exclusive = istream.read_string ();
    value.ccInclusions = subnetworkConnection.CrossConnectList_THelper.read (istream);
    value.neTpInclusions = subnetworkConnection.ResourceList_THelper.read (istream);
    value.fullRoute = istream.read_boolean ();
    value.neTpSncExclusions = subnetworkConnection.ResourceList_THelper.read (istream);
    value.additionalCreationInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.RouteCreateData_T value)
  {
    ostream.write_string (value.intended);
    ostream.write_string (value.exclusive);
    subnetworkConnection.CrossConnectList_THelper.write (ostream, value.ccInclusions);
    subnetworkConnection.ResourceList_THelper.write (ostream, value.neTpInclusions);
    ostream.write_boolean (value.fullRoute);
    subnetworkConnection.ResourceList_THelper.write (ostream, value.neTpSncExclusions);
    globaldefs.NVSList_THelper.write (ostream, value.additionalCreationInfo);
  }

}
