package subnetworkConnection;


/**
* subnetworkConnection/SNCType_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The SNC Type describes the connection based on the signal 
   * flows. The only types applicable to a Control Plane Connection are
   * ST_SIMPLE,ST_ADD_DROP_A and ST_ADD_DROP_Z.</p>
   *
   * <p>For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   *
   * <p>In case of an ATM SNC (VP or VC), ST_SIMPLE is used to specify a 'plain'
   * (hard or regular) PVC.</p>
   **/
public class SNCType_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 8;
  private static subnetworkConnection.SNCType_T[] __array = new subnetworkConnection.SNCType_T [__size];

  public static final int _ST_SIMPLE = 0;
  public static final subnetworkConnection.SNCType_T ST_SIMPLE = new subnetworkConnection.SNCType_T(_ST_SIMPLE);
  public static final int _ST_ADD_DROP_A = 1;
  public static final subnetworkConnection.SNCType_T ST_ADD_DROP_A = new subnetworkConnection.SNCType_T(_ST_ADD_DROP_A);
  public static final int _ST_ADD_DROP_Z = 2;
  public static final subnetworkConnection.SNCType_T ST_ADD_DROP_Z = new subnetworkConnection.SNCType_T(_ST_ADD_DROP_Z);
  public static final int _ST_INTERCONNECT = 3;
  public static final subnetworkConnection.SNCType_T ST_INTERCONNECT = new subnetworkConnection.SNCType_T(_ST_INTERCONNECT);
  public static final int _ST_DOUBLE_INTERCONNECT = 4;
  public static final subnetworkConnection.SNCType_T ST_DOUBLE_INTERCONNECT = new subnetworkConnection.SNCType_T(_ST_DOUBLE_INTERCONNECT);
  public static final int _ST_DOUBLE_ADD_DROP = 5;
  public static final subnetworkConnection.SNCType_T ST_DOUBLE_ADD_DROP = new subnetworkConnection.SNCType_T(_ST_DOUBLE_ADD_DROP);
  public static final int _ST_OPEN_ADD_DROP = 6;
  public static final subnetworkConnection.SNCType_T ST_OPEN_ADD_DROP = new subnetworkConnection.SNCType_T(_ST_OPEN_ADD_DROP);
  public static final int _ST_EXPLICIT = 7;
  public static final subnetworkConnection.SNCType_T ST_EXPLICIT = new subnetworkConnection.SNCType_T(_ST_EXPLICIT);

  public int value ()
  {
    return __value;
  }

  public static subnetworkConnection.SNCType_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected SNCType_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class SNCType_T
