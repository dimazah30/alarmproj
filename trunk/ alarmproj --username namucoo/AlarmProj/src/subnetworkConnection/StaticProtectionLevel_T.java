package subnetworkConnection;


/**
* subnetworkConnection/StaticProtectionLevel_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The static protection level is a statement of the internal resiliency of 
   * the SNC (internal to the subnetwork). The more resilient an SNC is, the 
   * more bandwidth it will consume.<br>
   * The protection level does not have any bearing on the externally visible
   * shape and traffic flows of the SNC (in non-failure cases).<br>
   * For a detailed description of the use of this attribute, see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   **/
public class StaticProtectionLevel_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 5;
  private static subnetworkConnection.StaticProtectionLevel_T[] __array = new subnetworkConnection.StaticProtectionLevel_T [__size];

  public static final int _PREEMPTIBLE = 0;
  public static final subnetworkConnection.StaticProtectionLevel_T PREEMPTIBLE = new subnetworkConnection.StaticProtectionLevel_T(_PREEMPTIBLE);
  public static final int _UNPROTECTED = 1;
  public static final subnetworkConnection.StaticProtectionLevel_T UNPROTECTED = new subnetworkConnection.StaticProtectionLevel_T(_UNPROTECTED);
  public static final int _PARTIALLY_PROTECTED = 2;
  public static final subnetworkConnection.StaticProtectionLevel_T PARTIALLY_PROTECTED = new subnetworkConnection.StaticProtectionLevel_T(_PARTIALLY_PROTECTED);
  public static final int _FULLY_PROTECTED = 3;
  public static final subnetworkConnection.StaticProtectionLevel_T FULLY_PROTECTED = new subnetworkConnection.StaticProtectionLevel_T(_FULLY_PROTECTED);
  public static final int _HIGHLY_PROTECTED = 4;
  public static final subnetworkConnection.StaticProtectionLevel_T HIGHLY_PROTECTED = new subnetworkConnection.StaticProtectionLevel_T(_HIGHLY_PROTECTED);

  public int value ()
  {
    return __value;
  }

  public static subnetworkConnection.StaticProtectionLevel_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected StaticProtectionLevel_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class StaticProtectionLevel_T
