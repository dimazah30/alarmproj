package mLSNPPLink;


/**
* mLSNPPLink/MultiLayerSNPPLink_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

abstract public class MultiLayerSNPPLink_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPPLink/MultiLayerSNPPLink_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPPLink.MultiLayerSNPPLink_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPPLink.MultiLayerSNPPLink_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [22];
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
          _tcOf_members0 = globaldefs.ConnectionDirection_THelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "direction",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "aMLRAName",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "zMLRAName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[7] = new org.omg.CORBA.StructMember (
            "aTNAName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[8] = new org.omg.CORBA.StructMember (
            "zTNAName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[9] = new org.omg.CORBA.StructMember (
            "aTNAGroupName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[10] = new org.omg.CORBA.StructMember (
            "zTNAGroupName",
            _tcOf_members0,
            null);
          _tcOf_members0 = mLSNPPLink.LayeredSNPPLink_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPPLink.LayeredSNPPLinkList_THelper.id (), "LayeredSNPPLinkList_T", _tcOf_members0);
          _members0[11] = new org.omg.CORBA.StructMember (
            "sNPPLinkList",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPPLink.InterfaceType_THelper.id (), "InterfaceType_T", _tcOf_members0);
          _members0[12] = new org.omg.CORBA.StructMember (
            "interfaceType",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[13] = new org.omg.CORBA.StructMember (
            "signallingParameters",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[14] = new org.omg.CORBA.StructMember (
            "signallingControllerIdentifier",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPPLink.SignallingProtocol_THelper.id (), "SignallingProtocol_T", _tcOf_members0);
          _members0[15] = new org.omg.CORBA.StructMember (
            "signallingProtocol",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[16] = new org.omg.CORBA.StructMember (
            "signallingEnabled",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[17] = new org.omg.CORBA.StructMember (
            "cost",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[18] = new org.omg.CORBA.StructMember (
            "discovered",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[19] = new org.omg.CORBA.StructMember (
            "availability",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[20] = new org.omg.CORBA.StructMember (
            "linkSRG",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[21] = new org.omg.CORBA.StructMember (
            "additionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (mLSNPPLink.MultiLayerSNPPLink_THelper.id (), "MultiLayerSNPPLink_T", _members0);
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

  public static mLSNPPLink.MultiLayerSNPPLink_T read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPPLink.MultiLayerSNPPLink_T value = new mLSNPPLink.MultiLayerSNPPLink_T ();
    value.name = globaldefs.NVSList_THelper.read (istream);
    value.userLabel = istream.read_string ();
    value.nativeEMSName = istream.read_string ();
    value.owner = istream.read_string ();
    value.direction = globaldefs.ConnectionDirection_THelper.read (istream);
    value.aMLRAName = globaldefs.NVSList_THelper.read (istream);
    value.zMLRAName = globaldefs.NVSList_THelper.read (istream);
    value.aTNAName = istream.read_string ();
    value.zTNAName = istream.read_string ();
    value.aTNAGroupName = istream.read_string ();
    value.zTNAGroupName = istream.read_string ();
    value.sNPPLinkList = mLSNPPLink.LayeredSNPPLinkList_THelper.read (istream);
    value.interfaceType = istream.read_string ();
    value.signallingParameters = globaldefs.NVSList_THelper.read (istream);
    value.signallingControllerIdentifier = istream.read_string ();
    value.signallingProtocol = istream.read_string ();
    value.signallingEnabled = istream.read_boolean ();
    value.cost = globaldefs.NVSList_THelper.read (istream);
    value.discovered = istream.read_boolean ();
    value.availability = globaldefs.NVSList_THelper.read (istream);
    value.linkSRG = istream.read_string ();
    value.additionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPPLink.MultiLayerSNPPLink_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.name);
    ostream.write_string (value.userLabel);
    ostream.write_string (value.nativeEMSName);
    ostream.write_string (value.owner);
    globaldefs.ConnectionDirection_THelper.write (ostream, value.direction);
    globaldefs.NVSList_THelper.write (ostream, value.aMLRAName);
    globaldefs.NVSList_THelper.write (ostream, value.zMLRAName);
    ostream.write_string (value.aTNAName);
    ostream.write_string (value.zTNAName);
    ostream.write_string (value.aTNAGroupName);
    ostream.write_string (value.zTNAGroupName);
    mLSNPPLink.LayeredSNPPLinkList_THelper.write (ostream, value.sNPPLinkList);
    ostream.write_string (value.interfaceType);
    globaldefs.NVSList_THelper.write (ostream, value.signallingParameters);
    ostream.write_string (value.signallingControllerIdentifier);
    ostream.write_string (value.signallingProtocol);
    ostream.write_boolean (value.signallingEnabled);
    globaldefs.NVSList_THelper.write (ostream, value.cost);
    ostream.write_boolean (value.discovered);
    globaldefs.NVSList_THelper.write (ostream, value.availability);
    ostream.write_string (value.linkSRG);
    globaldefs.NVSList_THelper.write (ostream, value.additionalInfo);
  }

}
