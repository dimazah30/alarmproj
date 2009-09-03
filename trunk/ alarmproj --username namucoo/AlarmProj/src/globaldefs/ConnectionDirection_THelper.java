package globaldefs;


/**
* globaldefs/ConnectionDirection_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p>Direction of a subnetwork connection, cross-connects, or topological 
   * link:
   * <br>UNI: UNIdirectional, i.e. source TP to sink TP. 
   * Note: creation of unidirectional connections is supported even when 
   * CTPs/FTPs are modelled as bidirectional.<br>
   * <br>CD_BI: BIdirectional, i.e. bidirectional TP to bidirectional TP, 
   * a.k.a. two-way.<br>
   * For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.
   * </p>
   **/
abstract public class ConnectionDirection_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/globaldefs/ConnectionDirection_T:1.0";

  public static void insert (org.omg.CORBA.Any a, globaldefs.ConnectionDirection_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static globaldefs.ConnectionDirection_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (globaldefs.ConnectionDirection_THelper.id (), "ConnectionDirection_T", new String[] { "CD_UNI", "CD_BI"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static globaldefs.ConnectionDirection_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return globaldefs.ConnectionDirection_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, globaldefs.ConnectionDirection_T value)
  {
    ostream.write_long (value.value ());
  }

}
