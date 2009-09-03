package subnetworkConnection;


/**
* subnetworkConnection/TPData_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

abstract public class TPData_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/TPData_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.TPData_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.TPData_T extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "tpName",
            _tcOf_members0,
            null);
          _tcOf_members0 = terminationPoint.TerminationMode_THelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "tpMappingMode",
            _tcOf_members0,
            null);
          _tcOf_members0 = transmissionParameters.LayeredParameters_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayeredParameterList_THelper.id (), "LayeredParameterList_T", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "transmissionParams",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "ingressTrafficDescriptorName",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "egressTrafficDescriptorName",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (subnetworkConnection.TPData_THelper.id (), "TPData_T", _members0);
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

  public static subnetworkConnection.TPData_T read (org.omg.CORBA.portable.InputStream istream)
  {
    subnetworkConnection.TPData_T value = new subnetworkConnection.TPData_T ();
    value.tpName = globaldefs.NVSList_THelper.read (istream);
    value.tpMappingMode = terminationPoint.TerminationMode_THelper.read (istream);
    value.transmissionParams = transmissionParameters.LayeredParameterList_THelper.read (istream);
    value.ingressTrafficDescriptorName = globaldefs.NVSList_THelper.read (istream);
    value.egressTrafficDescriptorName = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.TPData_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.tpName);
    terminationPoint.TerminationMode_THelper.write (ostream, value.tpMappingMode);
    transmissionParameters.LayeredParameterList_THelper.write (ostream, value.transmissionParams);
    globaldefs.NVSList_THelper.write (ostream, value.ingressTrafficDescriptorName);
    globaldefs.NVSList_THelper.write (ostream, value.egressTrafficDescriptorName);
  }

}
