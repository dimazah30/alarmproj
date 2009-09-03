package terminationPoint;


/**
* terminationPoint/Directionality_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>Direction for a TerminationPoint:</p>
   * <br>D_NA = used when the directionality specification is not 
   * necessary.<br>
   * D_BIDIRECTIONAL = source and sink (transmit and receive).<br>
   * D_SOURCE = source (transmit).<br>
   * D_SINK = sink (receive).<br> 
   * <br>
   *
   * <p>The directionality of PTPs is defined from an external point of view,
   * while the directionality of CTPs is defined from an internal point of view.
   * Consequently, sink PTPs generate source CTPs, and sink CTPs form source 
   * PTPs.
   * Refer to <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a> and
   * to <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for further information on termination point and connection directionality.</p>
   *
   * <p>Note that ATM termination points (LR_ATM_NI, LR_ATM_VP and LR_ATM_VC) 
   * are always bi-directional even though the traffic may be asymmetric (and 
   * eventually null in one of the two directions).</p>
   **/
abstract public class Directionality_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/Directionality_T:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.Directionality_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.Directionality_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (terminationPoint.Directionality_THelper.id (), "Directionality_T", new String[] { "D_NA", "D_BIDIRECTIONAL", "D_SOURCE", "D_SINK"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static terminationPoint.Directionality_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return terminationPoint.Directionality_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.Directionality_T value)
  {
    ostream.write_long (value.value ());
  }

}
