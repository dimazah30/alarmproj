package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/EMSFreedomLevel_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * <p>Describes the NMS-specified EMS level of freedom when performing SNC 
   * operations.</p>
   * <p>EMSFL_CC_AT_SNC_LAYER: The EMS is allowed to create or delete cross-
   * connections,at the layer of the SNC <i>only</i>, that are or will be 
   * directly used by it.</p>
   * <p>EMSFL_TERMINATE_AND_MAP: In addition to EMSFL_CC_AT_SNC_LAYER, the EMS 
   * is allowed to terminate and map or unmap and unterminate CTPs
   * to generate or eliminate CTPs that are or will be used by the SNC.</p>
   * <p>EMSFL_HIGHER_ORDER_SNCS: In addition to EMSFL_TERMINATE_AND_MAP, the EMS 
   * is allowed to create or delete higher order SNCs that are or will be used 
   * to carry the SNC.</p> 
   * <p>EMSFL_RECONFIGURATION: The EMS is allowed to perform <i>any</i> 
   * operation that it considers relevant, which includes reorganizing any SNC 
   * or TP to allow the creation or activation of the SNC or to make the 
   * subnetwork more efficient.</p> 
   **/
abstract public class EMSFreedomLevel_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/multiLayerSubnetwork/EMSFreedomLevel_T:1.0";

  public static void insert (org.omg.CORBA.Any a, multiLayerSubnetwork.EMSFreedomLevel_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static multiLayerSubnetwork.EMSFreedomLevel_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (multiLayerSubnetwork.EMSFreedomLevel_THelper.id (), "EMSFreedomLevel_T", new String[] { "EMSFL_CC_AT_SNC_LAYER", "EMSFL_TERMINATE_AND_MAP", "EMSFL_HIGHER_ORDER_SNCS", "EMSFL_RECONFIGURATION"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static multiLayerSubnetwork.EMSFreedomLevel_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return multiLayerSubnetwork.EMSFreedomLevel_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, multiLayerSubnetwork.EMSFreedomLevel_T value)
  {
    ostream.write_long (value.value ());
  }

}
