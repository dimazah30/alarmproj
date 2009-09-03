package aSAP;


/**
* aSAP/AlarmSeverityAssignment_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/

abstract public class AlarmSeverityAssignment_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/aSAP/AlarmSeverityAssignment_T:1.0";

  public static void insert (org.omg.CORBA.Any a, aSAP.AlarmSeverityAssignment_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static aSAP.AlarmSeverityAssignment_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "probableCause",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "probableCauseQualifier",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "nativeProbableCause",
            _tcOf_members0,
            null);
          _tcOf_members0 = aSAP.AssignedSeverity_THelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "serviceAffecting",
            _tcOf_members0,
            null);
          _tcOf_members0 = aSAP.AssignedSeverity_THelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "serviceNonAffecting",
            _tcOf_members0,
            null);
          _tcOf_members0 = aSAP.AssignedSeverity_THelper.type ();
          _members0[5] = new org.omg.CORBA.StructMember (
            "serviceIndependentOrUnknown",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (aSAP.AlarmSeverityAssignment_THelper.id (), "AlarmSeverityAssignment_T", _members0);
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

  public static aSAP.AlarmSeverityAssignment_T read (org.omg.CORBA.portable.InputStream istream)
  {
    aSAP.AlarmSeverityAssignment_T value = new aSAP.AlarmSeverityAssignment_T ();
    value.probableCause = istream.read_string ();
    value.probableCauseQualifier = istream.read_string ();
    value.nativeProbableCause = istream.read_string ();
    value.serviceAffecting = aSAP.AssignedSeverity_THelper.read (istream);
    value.serviceNonAffecting = aSAP.AssignedSeverity_THelper.read (istream);
    value.serviceIndependentOrUnknown = aSAP.AssignedSeverity_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, aSAP.AlarmSeverityAssignment_T value)
  {
    ostream.write_string (value.probableCause);
    ostream.write_string (value.probableCauseQualifier);
    ostream.write_string (value.nativeProbableCause);
    aSAP.AssignedSeverity_THelper.write (ostream, value.serviceAffecting);
    aSAP.AssignedSeverity_THelper.write (ostream, value.serviceNonAffecting);
    aSAP.AssignedSeverity_THelper.write (ostream, value.serviceIndependentOrUnknown);
  }

}
