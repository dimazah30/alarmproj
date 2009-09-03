package subnetworkConnection;


/**
* subnetworkConnection/ProtectionEffort_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The protection effort is a statement of the requirement
   * of the static protection level.  
   * For example if EFFORT_SAME_OR_WORSE is specified for a 3-ended
   * FULLY_PROTECTED connection, a 3-ended PARTIALLY_PROTECTED connection is 
   * acceptable, but a 2-ended connection (ST_SIMPLE) is not acceptable i.e. 
   * ProtectionEffort_T does not have any bearing on the externally visible shape 
   * of the SNC.</p>
   *
   * <p>EFFORT_WHATEVER indicates that the specified static protection level is 
   * preferred, but that any other level is acceptable.</p>
   *
   * <p>For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   **/
public class ProtectionEffort_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static subnetworkConnection.ProtectionEffort_T[] __array = new subnetworkConnection.ProtectionEffort_T [__size];

  public static final int _EFFORT_WHATEVER = 0;
  public static final subnetworkConnection.ProtectionEffort_T EFFORT_WHATEVER = new subnetworkConnection.ProtectionEffort_T(_EFFORT_WHATEVER);
  public static final int _EFFORT_SAME_OR_BETTER = 1;
  public static final subnetworkConnection.ProtectionEffort_T EFFORT_SAME_OR_BETTER = new subnetworkConnection.ProtectionEffort_T(_EFFORT_SAME_OR_BETTER);
  public static final int _EFFORT_SAME_OR_WORSE = 2;
  public static final subnetworkConnection.ProtectionEffort_T EFFORT_SAME_OR_WORSE = new subnetworkConnection.ProtectionEffort_T(_EFFORT_SAME_OR_WORSE);
  public static final int _EFFORT_SAME = 3;
  public static final subnetworkConnection.ProtectionEffort_T EFFORT_SAME = new subnetworkConnection.ProtectionEffort_T(_EFFORT_SAME);

  public int value ()
  {
    return __value;
  }

  public static subnetworkConnection.ProtectionEffort_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ProtectionEffort_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ProtectionEffort_T
