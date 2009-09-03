package terminationPoint;


/**
* terminationPoint/TPProtectionAssociation_THelper.java .
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
abstract public class TPProtectionAssociation_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/TPProtectionAssociation_T:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.TPProtectionAssociation_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.TPProtectionAssociation_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (terminationPoint.TPProtectionAssociation_THelper.id (), "TPProtectionAssociation_T", new String[] { "TPPA_NA", "TPPA_PSR_RELATED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static terminationPoint.TPProtectionAssociation_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return terminationPoint.TPProtectionAssociation_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.TPProtectionAssociation_T value)
  {
    ostream.write_long (value.value ());
  }

}
