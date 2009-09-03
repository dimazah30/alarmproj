package subnetworkConnection;


/**
* subnetworkConnection/GradesOfImpact_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Grades of maximum tolerable disruption to traffic as a result of the
   * operation that this parameter is describing. The following relates 
   * to design intent:<br>GOI_HITLESS,<br>
   * GOI_MINOR_IMPACT <= 50ms,<br>
   * GOI_MAJOR_IMPACT > 50ms.<br></p>
   **/
abstract public class GradesOfImpact_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/GradesOfImpact_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.GradesOfImpact_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.GradesOfImpact_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (subnetworkConnection.GradesOfImpact_THelper.id (), "GradesOfImpact_T", new String[] { "GOI_HITLESS", "GOI_MINOR_IMPACT", "GOI_MAJOR_IMPACT"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.GradesOfImpact_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return subnetworkConnection.GradesOfImpact_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.GradesOfImpact_T value)
  {
    ostream.write_long (value.value ());
  }

}
