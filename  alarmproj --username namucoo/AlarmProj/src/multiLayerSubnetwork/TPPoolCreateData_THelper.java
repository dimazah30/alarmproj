package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/TPPoolCreateData_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/

abstract public class TPPoolCreateData_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/multiLayerSubnetwork/TPPoolCreateData_T:1.0";

  public static void insert (org.omg.CORBA.Any a, multiLayerSubnetwork.TPPoolCreateData_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static multiLayerSubnetwork.TPPoolCreateData_T extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = multiLayerSubnetwork.MultiLayerSubnetwork_THelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "containingMLSN",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributesList_THelper.id (), "NamingAttributesList_T", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "containedMembers",
            _tcOf_members0,
            null);
          _tcOf_members0 = transmissionParameters.LayeredParameters_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayeredParameterList_THelper.id (), "LayeredParameterList_T", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "transmissionParams",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "descriptionOfUse",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[7] = new org.omg.CORBA.StructMember (
            "additionalCreationInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (multiLayerSubnetwork.TPPoolCreateData_THelper.id (), "TPPoolCreateData_T", _members0);
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

  public static multiLayerSubnetwork.TPPoolCreateData_T read (org.omg.CORBA.portable.InputStream istream)
  {
    multiLayerSubnetwork.TPPoolCreateData_T value = new multiLayerSubnetwork.TPPoolCreateData_T ();
    value.userLabel = istream.read_string ();
    value.forceUniqueness = istream.read_boolean ();
    value.owner = istream.read_string ();
    value.containingMLSN = multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read (istream);
    value.containedMembers = globaldefs.NamingAttributesList_THelper.read (istream);
    value.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read (istream);
    value.descriptionOfUse = istream.read_string ();
    value.additionalCreationInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, multiLayerSubnetwork.TPPoolCreateData_T value)
  {
    ostream.write_string (value.userLabel);
    ostream.write_boolean (value.forceUniqueness);
    ostream.write_string (value.owner);
    multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write (ostream, value.containingMLSN);
    globaldefs.NamingAttributesList_THelper.write (ostream, value.containedMembers);
    transmissionParameters.LayeredParameterList_THelper.write (ostream, value.transmissionParams);
    ostream.write_string (value.descriptionOfUse);
    globaldefs.NVSList_THelper.write (ostream, value.additionalCreationInfo);
  }

}
