package callSNC;


/**
* callSNC/Call_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

abstract public class Call_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/Call_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.Call_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.Call_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [17];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "callName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "userLabel",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "owner",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "networkAccessDomain",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "nativeEMSName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "callId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.CallState_THelper.id (), "CallState_T", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "callState",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.CallEnd_THelper.type ();
          _members0[7] = new org.omg.CORBA.StructMember (
            "aEnd",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.CallEnd_THelper.type ();
          _members0[8] = new org.omg.CORBA.StructMember (
            "zEnd",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.CallParameterProfile_THelper.type ();
          _members0[9] = new org.omg.CORBA.StructMember (
            "callParameters",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.Diversity_THelper.type ();
          _members0[10] = new org.omg.CORBA.StructMember (
            "callDiversity",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[11] = new org.omg.CORBA.StructMember (
            "diversitySynthesis",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.DiversityInfo_THelper.type ();
          _members0[12] = new org.omg.CORBA.StructMember (
            "linkDiversityViolations",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.DiversityInfo_THelper.type ();
          _members0[13] = new org.omg.CORBA.StructMember (
            "nodeDiversityViolations",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.DiversityInfo_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.DiversityInfoList_THelper.id (), "DiversityInfoList_T", _tcOf_members0);
          _members0[14] = new org.omg.CORBA.StructMember (
            "linkPartialDiversityList",
            _tcOf_members0,
            null);
          _tcOf_members0 = callSNC.DiversityInfo_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.DiversityInfoList_THelper.id (), "DiversityInfoList_T", _tcOf_members0);
          _members0[15] = new org.omg.CORBA.StructMember (
            "nodePartialDiversityList",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[16] = new org.omg.CORBA.StructMember (
            "callAdditionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (callSNC.Call_THelper.id (), "Call_T", _members0);
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

  public static callSNC.Call_T read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.Call_T value = new callSNC.Call_T ();
    value.callName = globaldefs.NVSList_THelper.read (istream);
    value.userLabel = istream.read_string ();
    value.owner = istream.read_string ();
    value.networkAccessDomain = istream.read_string ();
    value.nativeEMSName = istream.read_string ();
    value.callId = istream.read_string ();
    value.callState = istream.read_string ();
    value.aEnd = callSNC.CallEnd_THelper.read (istream);
    value.zEnd = callSNC.CallEnd_THelper.read (istream);
    value.callParameters = callSNC.CallParameterProfile_THelper.read (istream);
    value.callDiversity = callSNC.Diversity_THelper.read (istream);
    value.diversitySynthesis = istream.read_string ();
    value.linkDiversityViolations = callSNC.DiversityInfo_THelper.read (istream);
    value.nodeDiversityViolations = callSNC.DiversityInfo_THelper.read (istream);
    value.linkPartialDiversityList = callSNC.DiversityInfoList_THelper.read (istream);
    value.nodePartialDiversityList = callSNC.DiversityInfoList_THelper.read (istream);
    value.callAdditionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.Call_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.callName);
    ostream.write_string (value.userLabel);
    ostream.write_string (value.owner);
    ostream.write_string (value.networkAccessDomain);
    ostream.write_string (value.nativeEMSName);
    ostream.write_string (value.callId);
    ostream.write_string (value.callState);
    callSNC.CallEnd_THelper.write (ostream, value.aEnd);
    callSNC.CallEnd_THelper.write (ostream, value.zEnd);
    callSNC.CallParameterProfile_THelper.write (ostream, value.callParameters);
    callSNC.Diversity_THelper.write (ostream, value.callDiversity);
    ostream.write_string (value.diversitySynthesis);
    callSNC.DiversityInfo_THelper.write (ostream, value.linkDiversityViolations);
    callSNC.DiversityInfo_THelper.write (ostream, value.nodeDiversityViolations);
    callSNC.DiversityInfoList_THelper.write (ostream, value.linkPartialDiversityList);
    callSNC.DiversityInfoList_THelper.write (ostream, value.nodePartialDiversityList);
    globaldefs.NVSList_THelper.write (ostream, value.callAdditionalInfo);
  }

}
