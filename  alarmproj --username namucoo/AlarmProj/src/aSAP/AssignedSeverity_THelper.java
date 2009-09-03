package aSAP;


/**
* aSAP/AssignedSeverity_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/


/**
   * <p>Alarm notifications include a severity. The severity is defined in
   * notifications::PerceivedSeverity_T .</p>
   *
   * <p>The assigned severity is allocated to a probable cause using the
   * alarm severity assignment profile (ASAP). The identified probable cause  
   * should be raised with the assigned severity. The assignment of severities 
   * is extended beyond notifications::PerceivedSeverity_T to cover the case 
   * where:<ul>
   * <li>no alarm should be raised: "AS_NONALARMED"</li>
   * <li>the EMS/ME is free to make a choice based upon its local criteria: 
   * "AS_FREE_CHOICE"</li></ul></p>
   **/
abstract public class AssignedSeverity_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/aSAP/AssignedSeverity_T:1.0";

  public static void insert (org.omg.CORBA.Any a, aSAP.AssignedSeverity_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static aSAP.AssignedSeverity_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (aSAP.AssignedSeverity_THelper.id (), "AssignedSeverity_T", new String[] { "AS_INDETERMINATE", "AS_CRITICAL", "AS_MAJOR", "AS_MINOR", "AS_WARNING", "AS_NONALARMED", "AS_FREE_CHOICE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static aSAP.AssignedSeverity_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return aSAP.AssignedSeverity_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, aSAP.AssignedSeverity_T value)
  {
    ostream.write_long (value.value ());
  }

}
