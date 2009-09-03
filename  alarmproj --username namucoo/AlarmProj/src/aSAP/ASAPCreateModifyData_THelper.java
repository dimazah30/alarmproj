package aSAP;


/**
* aSAP/ASAPCreateModifyData_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/

abstract public class ASAPCreateModifyData_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/aSAP/ASAPCreateModifyData_T:1.0";

  public static void insert (org.omg.CORBA.Any a, aSAP.ASAPCreateModifyData_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static aSAP.ASAPCreateModifyData_T extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = aSAP.AlarmSeverityAssignment_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (aSAP.AlarmSeverityAssignmentList_THelper.id (), "AlarmSeverityAssignmentList_T", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "alarmSeverityAssignmentList",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "additionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (aSAP.ASAPCreateModifyData_THelper.id (), "ASAPCreateModifyData_T", _members0);
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

  public static aSAP.ASAPCreateModifyData_T read (org.omg.CORBA.portable.InputStream istream)
  {
    aSAP.ASAPCreateModifyData_T value = new aSAP.ASAPCreateModifyData_T ();
    value.userLabel = istream.read_string ();
    value.forceUniqueness = istream.read_boolean ();
    value.owner = istream.read_string ();
    value.alarmSeverityAssignmentList = aSAP.AlarmSeverityAssignmentList_THelper.read (istream);
    value.additionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, aSAP.ASAPCreateModifyData_T value)
  {
    ostream.write_string (value.userLabel);
    ostream.write_boolean (value.forceUniqueness);
    ostream.write_string (value.owner);
    aSAP.AlarmSeverityAssignmentList_THelper.write (ostream, value.alarmSeverityAssignmentList);
    globaldefs.NVSList_THelper.write (ostream, value.additionalInfo);
  }

}
