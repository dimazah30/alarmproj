package subnetworkConnection;


/**
* subnetworkConnection/GradesOfImpact_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Grades of maximum tolerable disruption to traffic as a result of the
   * operation that this parameter is describing. The following relates 
   * to design intent:<br>GOI_HITLESS,<br>
   * GOI_MINOR_IMPACT <= 50ms,<br>
   * GOI_MAJOR_IMPACT > 50ms.<br></p>
   **/
public class GradesOfImpact_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static subnetworkConnection.GradesOfImpact_T[] __array = new subnetworkConnection.GradesOfImpact_T [__size];

  public static final int _GOI_HITLESS = 0;
  public static final subnetworkConnection.GradesOfImpact_T GOI_HITLESS = new subnetworkConnection.GradesOfImpact_T(_GOI_HITLESS);
  public static final int _GOI_MINOR_IMPACT = 1;
  public static final subnetworkConnection.GradesOfImpact_T GOI_MINOR_IMPACT = new subnetworkConnection.GradesOfImpact_T(_GOI_MINOR_IMPACT);
  public static final int _GOI_MAJOR_IMPACT = 2;
  public static final subnetworkConnection.GradesOfImpact_T GOI_MAJOR_IMPACT = new subnetworkConnection.GradesOfImpact_T(_GOI_MAJOR_IMPACT);

  public int value ()
  {
    return __value;
  }

  public static subnetworkConnection.GradesOfImpact_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected GradesOfImpact_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class GradesOfImpact_T
