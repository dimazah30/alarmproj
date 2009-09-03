package subnetworkConnection;


/**
* subnetworkConnection/ProtectionEffort_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The protection effort is a statement of the requirement
   * of the static protection level.  
   * For example if EFFORT_SAME_OR_WORSE is specified for a 3-ended
   * FULLY_PROTECTED connection, a 3-ended PARTIALLY_PROTECTED connection is 
   * acceptable, but a 2-ended connection (ST_SIMPLE) is not acceptable i.e. 
   * ProtectionEffort_T does not have any bearing on the externally visible shape 
   * of the SNC.</p>
   *
   * <p>EFFORT_WHATEVER indicates that the specified static protection level is 
   * preferred, but that any other level is acceptable.</p>
   *
   * <p>For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   **/
abstract public class ProtectionEffort_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/ProtectionEffort_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.ProtectionEffort_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.ProtectionEffort_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (subnetworkConnection.ProtectionEffort_THelper.id (), "ProtectionEffort_T", new String[] { "EFFORT_WHATEVER", "EFFORT_SAME_OR_BETTER", "EFFORT_SAME_OR_WORSE", "EFFORT_SAME"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.ProtectionEffort_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return subnetworkConnection.ProtectionEffort_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.ProtectionEffort_T value)
  {
    ostream.write_long (value.value ());
  }

}
