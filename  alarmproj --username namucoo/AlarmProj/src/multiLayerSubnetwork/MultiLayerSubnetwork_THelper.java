package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/MultiLayerSubnetwork_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/

abstract public class MultiLayerSubnetwork_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetwork_T:1.0";

  public static void insert (org.omg.CORBA.Any a, multiLayerSubnetwork.MultiLayerSubnetwork_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static multiLayerSubnetwork.MultiLayerSubnetwork_T extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = multiLayerSubnetwork.Topology_THelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "subnetworkType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRateList_THelper.id (), "LayerRateList_T", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "supportedRates",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "additionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (multiLayerSubnetwork.MultiLayerSubnetwork_THelper.id (), "MultiLayerSubnetwork_T", _members0);
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

  public static multiLayerSubnetwork.MultiLayerSubnetwork_T read (org.omg.CORBA.portable.InputStream istream)
  {
    multiLayerSubnetwork.MultiLayerSubnetwork_T value = new multiLayerSubnetwork.MultiLayerSubnetwork_T ();
    value.name = globaldefs.NVSList_THelper.read (istream);
    value.userLabel = istream.read_string ();
    value.nativeEMSName = istream.read_string ();
    value.owner = istream.read_string ();
    value.subnetworkType = multiLayerSubnetwork.Topology_THelper.read (istream);
    value.supportedRates = transmissionParameters.LayerRateList_THelper.read (istream);
    value.additionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, multiLayerSubnetwork.MultiLayerSubnetwork_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.name);
    ostream.write_string (value.userLabel);
    ostream.write_string (value.nativeEMSName);
    ostream.write_string (value.owner);
    multiLayerSubnetwork.Topology_THelper.write (ostream, value.subnetworkType);
    transmissionParameters.LayerRateList_THelper.write (ostream, value.supportedRates);
    globaldefs.NVSList_THelper.write (ostream, value.additionalInfo);
  }

}
