package transmissionParameters;


/**
* transmissionParameters/LayerRate_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 transmissionParameters.idl
* 2009年9月2日 星期三 下午03时27分33秒 CST
*/


/**
   * <p>The LayerRate_T value is used to identify:</p>
   * - the Layer of a TTP/CTP,<br>
   * - the characteristic information of a PTP/FTP,<br>
   * - the Layer/Rate of a connection.<br>
   * <p>Each LayerRate_T may be used in conjunction with a CTP/TTP/FTP of that 
   * layer. In the SDH definitions, the G.805 CP and G.805 Termination Function 
   * layer names differ, for example TU12 is used for the G.805 CP and VC12 for 
   * the corresponding G.805 Termination Function. In this interface definition 
   * the TU and VC definitions have been combined into a single composite layer 
   * and this has been named to include the equivalent SONET layer, e.g. 
   * LR_VT2_and_TU12_VC12.</p>
   * 
   * <p>For details on how layer rate is used and details on use of each layer, 
   * rate see <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   *
   * <p>Certain specific LayerRates have been included to allow for description
   * of Ports (Physical Termination Points - PTPs) in SONET equipment.</p>
   *
   * <p>For details on the currently defined LayerRates see 
   * <a href=../../../supportingDocumentation/SD1-17_LayerRates.pdf >SD1-17_LayerRates</a>.</p>
   *
   * <p>Any extension to the list of integers defined here will be
   * agreed upon through a formal
   * process. They will be added at the end of the range.  
   * The type of the LayerRate has been made a 'short' rather than an enum to 
   * allow new rates to be added without changing the IDL interface.  The value 
   * for any new rates would have to be agreed by client and server and will be 
   * included in the next IDL release for documentation.  
   * Other layerRates may be added with the approval of the Specification
   * Authority. </p>
   *
   * <p>The interface definition allows for failed specification of layer in the
   * connection creation service. This is to allow the EMS to
   * make the choice of specific layer of the connection to support the 
   * requested
   * signal flow. The layer specified must be supported by the physical 
   * termination 
   * identified. The layer chosen by the subnetwork will have the same rate as 
   * that requested or will have a greater capacity.</p>
   *
   * <p>For example, LR_T1_and_DS1_1_5M may be used in place of 
   * LR_VT1_5_and_TU11_VC11 
   * where the NMS client does not want to dictate to the EMS the actual 
   * solution to a connection request. In this case the EMS may choose a VT1.5
   * connection to join the two CTPs/FTPs identified in the request. </p>
   *
   * <p>The EMS may reject a request for a connection at a layer that it can not
   * specifically support. </p>
   *
   **/
abstract public class LayerRate_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/transmissionParameters/LayerRate_T:1.0";

  public static void insert (org.omg.CORBA.Any a, short that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static short extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static short read (org.omg.CORBA.portable.InputStream istream)
  {
    short value = (short)0;
    value = istream.read_short ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, short value)
  {
    ostream.write_short (value);
  }

}
