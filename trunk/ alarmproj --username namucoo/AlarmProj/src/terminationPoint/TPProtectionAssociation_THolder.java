package terminationPoint;

/**
* terminationPoint/TPProtectionAssociation_THolder.java .
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
public final class TPProtectionAssociation_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.TPProtectionAssociation_T value = null;

  public TPProtectionAssociation_THolder ()
  {
  }

  public TPProtectionAssociation_THolder (terminationPoint.TPProtectionAssociation_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.TPProtectionAssociation_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.TPProtectionAssociation_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.TPProtectionAssociation_THelper.type ();
  }

}
