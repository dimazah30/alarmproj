package terminationPoint;


/**
* terminationPoint/GTPEffort_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>The GTP effort is a statement of the requirement of the list of CTPs
   * that a new GTP. If EFFORT_SAME is specified then the EMS must create the 
   * GTP with the exact same list of CTPs as provided with the GTP creation 
   * request. Further, if the NMS uses EFFORT_SAME, it is assume that the EMS 
   * will not modify the CTP list comprising the GTP at some later point (unless 
   * requested by the NMS via the modifyGTP operation). If EFFORT_WHATEVER is 
   * specified then the EMS may comply with the total bandwidth requirement by 
   * using a different set of CTPs.</p>
   *  
   * <p>If the NMS requests a GTP with gtpEffort equal to EFFORT_SAME, this also 
   * implies that the EMS will not modify on its own, i.e., the EMS will only 
   * modify the GTP if requested by the NMS via the modifyGTP operation.</p>
   **/
abstract public class GTPEffort_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/GTPEffort_T:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.GTPEffort_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.GTPEffort_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (terminationPoint.GTPEffort_THelper.id (), "GTPEffort_T", new String[] { "EFFORT_WHATEVER", "EFFORT_SAME"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static terminationPoint.GTPEffort_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return terminationPoint.GTPEffort_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.GTPEffort_T value)
  {
    ostream.write_long (value.value ());
  }

}
