package subnetworkConnection;


/**
* subnetworkConnection/Reroute_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The Reroute_T type indicates if the EMS/Mes/Control Plane are allowed 
   * and/or required to reroute this SNC if there 
   * is a failure on this SNC, periodically to optimize the routes, of for any 
   * other reason. This can be done either using network routing protocols or
   * through centralized management..</p>
   *
   * <p>The RR_NO value means that the EMS/MEs/Control Plane are not allowed to
   * reroute the 
   * SNC. The RR_YES value means that the EMS/MEs are allowed to reroute the SNC 
   * and required to attempt to reroute it upon failure.
   * The RR_NA value is used when the NMS does not want to specify the exact EMS 
   * behaviour. In this case it is left up to the EMS/MEs/Control Plane to
   * decide whether rerouting will be provided. It is also used if the
   * EMS/Mes/Control Plane are allowed to 
   * reroute the SNC but not required to attempt to reroute it upon failure.</p>
   **/
public class Reroute_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static subnetworkConnection.Reroute_T[] __array = new subnetworkConnection.Reroute_T [__size];

  public static final int _RR_NA = 0;
  public static final subnetworkConnection.Reroute_T RR_NA = new subnetworkConnection.Reroute_T(_RR_NA);
  public static final int _RR_NO = 1;
  public static final subnetworkConnection.Reroute_T RR_NO = new subnetworkConnection.Reroute_T(_RR_NO);
  public static final int _RR_YES = 2;
  public static final subnetworkConnection.Reroute_T RR_YES = new subnetworkConnection.Reroute_T(_RR_YES);

  public int value ()
  {
    return __value;
  }

  public static subnetworkConnection.Reroute_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Reroute_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Reroute_T
