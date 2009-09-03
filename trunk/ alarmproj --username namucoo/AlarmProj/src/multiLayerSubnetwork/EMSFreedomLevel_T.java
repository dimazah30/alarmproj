package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/EMSFreedomLevel_T.java .
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
public class EMSFreedomLevel_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static multiLayerSubnetwork.EMSFreedomLevel_T[] __array = new multiLayerSubnetwork.EMSFreedomLevel_T [__size];

  public static final int _EMSFL_CC_AT_SNC_LAYER = 0;
  public static final multiLayerSubnetwork.EMSFreedomLevel_T EMSFL_CC_AT_SNC_LAYER = new multiLayerSubnetwork.EMSFreedomLevel_T(_EMSFL_CC_AT_SNC_LAYER);
  public static final int _EMSFL_TERMINATE_AND_MAP = 1;
  public static final multiLayerSubnetwork.EMSFreedomLevel_T EMSFL_TERMINATE_AND_MAP = new multiLayerSubnetwork.EMSFreedomLevel_T(_EMSFL_TERMINATE_AND_MAP);
  public static final int _EMSFL_HIGHER_ORDER_SNCS = 2;
  public static final multiLayerSubnetwork.EMSFreedomLevel_T EMSFL_HIGHER_ORDER_SNCS = new multiLayerSubnetwork.EMSFreedomLevel_T(_EMSFL_HIGHER_ORDER_SNCS);
  public static final int _EMSFL_RECONFIGURATION = 3;
  public static final multiLayerSubnetwork.EMSFreedomLevel_T EMSFL_RECONFIGURATION = new multiLayerSubnetwork.EMSFreedomLevel_T(_EMSFL_RECONFIGURATION);

  public int value ()
  {
    return __value;
  }

  public static multiLayerSubnetwork.EMSFreedomLevel_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected EMSFreedomLevel_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class EMSFreedomLevel_T
