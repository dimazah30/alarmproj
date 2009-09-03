package terminationPoint;


/**
* terminationPoint/TPConnectionState_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>A CTP/FTP may be involved in zero, one, or many connections. The value
   * TPConnectionState indicates the degree to which a CTP/FTP is used.
   * The values TPCS_SOURCE_CONNECTED and TPCS_SINK_CONNECTED reflect the 
   * presence of a one way connection. The value TPCS_BI_CONNECTED means
   * that the TP is both sink and source connected.</p>
   *
   * <p>When this attribution is used in conjunction with a GTP, it indicates 
   * the TPConnectionState of the contained CTPs. All CTPs within a GTP shall 
   * have the same TPConnectionState. (see 
   * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
   * for further information on GTP usage). </p>
   *
   * <p>If an EMS cannot report whether the source of the TP is connected
   * or the sink is connected, TPCS_BI_CONNECTED may be reported by that
   * EMS.</p>
   *
   * <p>The value TPCS_NA is used for PTPs and TPPools.</p>
   **/
abstract public class TPConnectionState_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/TPConnectionState_T:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.TPConnectionState_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.TPConnectionState_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (terminationPoint.TPConnectionState_THelper.id (), "TPConnectionState_T", new String[] { "TPCS_NA", "TPCS_SOURCE_CONNECTED", "TPCS_SINK_CONNECTED", "TPCS_BI_CONNECTED", "TPCS_NOT_CONNECTED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static terminationPoint.TPConnectionState_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return terminationPoint.TPConnectionState_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.TPConnectionState_T value)
  {
    ostream.write_long (value.value ());
  }

}
