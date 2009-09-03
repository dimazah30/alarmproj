package globaldefs;


/**
* globaldefs/ConnectionDirection_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p>Direction of a subnetwork connection, cross-connects, or topological 
   * link:
   * <br>UNI: UNIdirectional, i.e. source TP to sink TP. 
   * Note: creation of unidirectional connections is supported even when 
   * CTPs/FTPs are modelled as bidirectional.<br>
   * <br>CD_BI: BIdirectional, i.e. bidirectional TP to bidirectional TP, 
   * a.k.a. two-way.<br>
   * For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.
   * </p>
   **/
public class ConnectionDirection_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static globaldefs.ConnectionDirection_T[] __array = new globaldefs.ConnectionDirection_T [__size];

  public static final int _CD_UNI = 0;
  public static final globaldefs.ConnectionDirection_T CD_UNI = new globaldefs.ConnectionDirection_T(_CD_UNI);
  public static final int _CD_BI = 1;
  public static final globaldefs.ConnectionDirection_T CD_BI = new globaldefs.ConnectionDirection_T(_CD_BI);

  public int value ()
  {
    return __value;
  }

  public static globaldefs.ConnectionDirection_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ConnectionDirection_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ConnectionDirection_T
