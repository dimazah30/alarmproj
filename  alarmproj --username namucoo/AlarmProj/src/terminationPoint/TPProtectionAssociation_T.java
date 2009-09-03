package terminationPoint;


/**
* terminationPoint/TPProtectionAssociation_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>tpProtectionAssociation expresses constraints on PTPs/CTPs/FTPs for 
   * PSR connection management.</p>
   *
   * <p>In a multi-layer subnetwork, say 'a', 'b', 'c' are edge points.
   * Suppose, for example, a three-ended connection is sought from 'a' to 'b', 
   * where 'b' is one of the endpoints.
   * If 'c' is the constrained choice for 'b' as the other end of the three-
   * ended connection,then 'b' and 'c' are said to be associated by a ]
   * protectionAssociation. 
   * The tpProtectionAssociation is set to TPPA_PSR_RELATED in 'b' and 'c', and 
   * getAssociatedTP(b) returns c and getAssociatedTP(c) returns b.</p>
   *
   * <p>In all other cases, tpProtectionAssociation is set to TPPA_NA.</p>
   *
   * <p>The multiLayerSubnetwork::MultiLayerSubnetworkMgr_I::getAssociatedTP()
   * service must be used to obtain the related TP.</p>  
   **/
public class TPProtectionAssociation_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static terminationPoint.TPProtectionAssociation_T[] __array = new terminationPoint.TPProtectionAssociation_T [__size];

  public static final int _TPPA_NA = 0;
  public static final terminationPoint.TPProtectionAssociation_T TPPA_NA = new terminationPoint.TPProtectionAssociation_T(_TPPA_NA);
  public static final int _TPPA_PSR_RELATED = 1;
  public static final terminationPoint.TPProtectionAssociation_T TPPA_PSR_RELATED = new terminationPoint.TPProtectionAssociation_T(_TPPA_PSR_RELATED);

  public int value ()
  {
    return __value;
  }

  public static terminationPoint.TPProtectionAssociation_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected TPProtectionAssociation_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class TPProtectionAssociation_T
