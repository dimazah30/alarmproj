package subnetworkConnection;


/**
* subnetworkConnection/StaticProtectionLevel_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The static protection level is a statement of the internal resiliency of 
   * the SNC (internal to the subnetwork). The more resilient an SNC is, the 
   * more bandwidth it will consume.<br>
   * The protection level does not have any bearing on the externally visible
   * shape and traffic flows of the SNC (in non-failure cases).<br>
   * For a detailed description of the use of this attribute, see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   **/
abstract public class StaticProtectionLevel_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/StaticProtectionLevel_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.StaticProtectionLevel_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.StaticProtectionLevel_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (subnetworkConnection.StaticProtectionLevel_THelper.id (), "StaticProtectionLevel_T", new String[] { "PREEMPTIBLE", "UNPROTECTED", "PARTIALLY_PROTECTED", "FULLY_PROTECTED", "HIGHLY_PROTECTED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.StaticProtectionLevel_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return subnetworkConnection.StaticProtectionLevel_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.StaticProtectionLevel_T value)
  {
    ostream.write_long (value.value ());
  }

}
