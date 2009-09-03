package aSAP;


/**
* aSAP/AlarmSeverityAssignmentList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/


/**
   * <p>An alarm severity assignment list provides a listing of all abnormal 
   * conditions that may exist in instances of an object class. 
   * Each element of this sequence specifies the probable cause (plus 
   * optionally the probableCauseQualifier and / or the nativeProbableCause) and 
   * the three severities to be assigned.</p>
   **/
abstract public class AlarmSeverityAssignmentList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/aSAP/AlarmSeverityAssignmentList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, aSAP.AlarmSeverityAssignment_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static aSAP.AlarmSeverityAssignment_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = aSAP.AlarmSeverityAssignment_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (aSAP.AlarmSeverityAssignmentList_THelper.id (), "AlarmSeverityAssignmentList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static aSAP.AlarmSeverityAssignment_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    aSAP.AlarmSeverityAssignment_T value[] = null;
    int _len0 = istream.read_long ();
    value = new aSAP.AlarmSeverityAssignment_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = aSAP.AlarmSeverityAssignment_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, aSAP.AlarmSeverityAssignment_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      aSAP.AlarmSeverityAssignment_THelper.write (ostream, value[_i0]);
  }

}
