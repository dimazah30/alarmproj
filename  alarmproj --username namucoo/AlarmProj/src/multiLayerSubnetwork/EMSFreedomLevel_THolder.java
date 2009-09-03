package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/EMSFreedomLevel_THolder.java .
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
public final class EMSFreedomLevel_THolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.EMSFreedomLevel_T value = null;

  public EMSFreedomLevel_THolder ()
  {
  }

  public EMSFreedomLevel_THolder (multiLayerSubnetwork.EMSFreedomLevel_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.EMSFreedomLevel_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.EMSFreedomLevel_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.EMSFreedomLevel_THelper.type ();
  }

}
