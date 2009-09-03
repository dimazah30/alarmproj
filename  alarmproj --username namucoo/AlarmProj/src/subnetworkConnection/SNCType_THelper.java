package subnetworkConnection;


/**
* subnetworkConnection/SNCType_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The SNC Type describes the connection based on the signal 
   * flows. The only types applicable to a Control Plane Connection are
   * ST_SIMPLE,ST_ADD_DROP_A and ST_ADD_DROP_Z.</p>
   *
   * <p>For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   *
   * <p>In case of an ATM SNC (VP or VC), ST_SIMPLE is used to specify a 'plain'
   * (hard or regular) PVC.</p>
   **/
abstract public class SNCType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/SNCType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.SNCType_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.SNCType_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (subnetworkConnection.SNCType_THelper.id (), "SNCType_T", new String[] { "ST_SIMPLE", "ST_ADD_DROP_A", "ST_ADD_DROP_Z", "ST_INTERCONNECT", "ST_DOUBLE_INTERCONNECT", "ST_DOUBLE_ADD_DROP", "ST_OPEN_ADD_DROP", "ST_EXPLICIT"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.SNCType_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return subnetworkConnection.SNCType_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.SNCType_T value)
  {
    ostream.write_long (value.value ());
  }

}
