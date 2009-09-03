package terminationPoint;


/**
* terminationPoint/TerminationPoint_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/

abstract public class TerminationPoint_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/TerminationPoint_T:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.TerminationPoint_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.TerminationPoint_T extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "ingressTrafficDescriptorName",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "egressTrafficDescriptorName",
            _tcOf_members0,
            null);
          _tcOf_members0 = terminationPoint.TPType_THelper.type ();
          _members0[6] = new org.omg.CORBA.StructMember (
            "type",
            _tcOf_members0,
            null);
          _tcOf_members0 = terminationPoint.TPConnectionState_THelper.type ();
          _members0[7] = new org.omg.CORBA.StructMember (
            "connectionState",
            _tcOf_members0,
            null);
          _tcOf_members0 = terminationPoint.TerminationMode_THelper.type ();
          _members0[8] = new org.omg.CORBA.StructMember (
            "tpMappingMode",
            _tcOf_members0,
            null);
          _tcOf_members0 = terminationPoint.Directionality_THelper.type ();
          _members0[9] = new org.omg.CORBA.StructMember (
            "direction",
            _tcOf_members0,
            null);
          _tcOf_members0 = transmissionParameters.LayeredParameters_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayeredParameterList_THelper.id (), "LayeredParameterList_T", _tcOf_members0);
          _members0[10] = new org.omg.CORBA.StructMember (
            "transmissionParams",
            _tcOf_members0,
            null);
          _tcOf_members0 = terminationPoint.TPProtectionAssociation_THelper.type ();
          _members0[11] = new org.omg.CORBA.StructMember (
            "tpProtectionAssociation",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[12] = new org.omg.CORBA.StructMember (
            "edgePoint",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[13] = new org.omg.CORBA.StructMember (
            "additionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (terminationPoint.TerminationPoint_THelper.id (), "TerminationPoint_T", _members0);
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

  public static terminationPoint.TerminationPoint_T read (org.omg.CORBA.portable.InputStream istream)
  {
    terminationPoint.TerminationPoint_T value = new terminationPoint.TerminationPoint_T ();
    value.name = globaldefs.NVSList_THelper.read (istream);
    value.userLabel = istream.read_string ();
    value.nativeEMSName = istream.read_string ();
    value.owner = istream.read_string ();
    value.ingressTrafficDescriptorName = globaldefs.NVSList_THelper.read (istream);
    value.egressTrafficDescriptorName = globaldefs.NVSList_THelper.read (istream);
    value.type = terminationPoint.TPType_THelper.read (istream);
    value.connectionState = terminationPoint.TPConnectionState_THelper.read (istream);
    value.tpMappingMode = terminationPoint.TerminationMode_THelper.read (istream);
    value.direction = terminationPoint.Directionality_THelper.read (istream);
    value.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read (istream);
    value.tpProtectionAssociation = terminationPoint.TPProtectionAssociation_THelper.read (istream);
    value.edgePoint = istream.read_boolean ();
    value.additionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.TerminationPoint_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.name);
    ostream.write_string (value.userLabel);
    ostream.write_string (value.nativeEMSName);
    ostream.write_string (value.owner);
    globaldefs.NVSList_THelper.write (ostream, value.ingressTrafficDescriptorName);
    globaldefs.NVSList_THelper.write (ostream, value.egressTrafficDescriptorName);
    terminationPoint.TPType_THelper.write (ostream, value.type);
    terminationPoint.TPConnectionState_THelper.write (ostream, value.connectionState);
    terminationPoint.TerminationMode_THelper.write (ostream, value.tpMappingMode);
    terminationPoint.Directionality_THelper.write (ostream, value.direction);
    transmissionParameters.LayeredParameterList_THelper.write (ostream, value.transmissionParams);
    terminationPoint.TPProtectionAssociation_THelper.write (ostream, value.tpProtectionAssociation);
    ostream.write_boolean (value.edgePoint);
    globaldefs.NVSList_THelper.write (ostream, value.additionalInfo);
  }

}
