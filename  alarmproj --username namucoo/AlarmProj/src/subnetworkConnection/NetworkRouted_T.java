package subnetworkConnection;


/**
* subnetworkConnection/NetworkRouted_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Network routed, indicates if the route must be or is computed and
   * implemented at the network level. NR_YES indicates that the
   * route must be / is computed at the network. NR_NO indicates that the route 
   * must not be / is not computed at the network. NR_NA indicates that the 
   * route can be computed anywhere.</p>
   * 
   * <p>If rerouting is allowed, this attribute will indicate who last rerouted 
   * the SNC, the network (NR_YES) or the EMS (NR_NO).</p>
   **/
public class NetworkRouted_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static subnetworkConnection.NetworkRouted_T[] __array = new subnetworkConnection.NetworkRouted_T [__size];

  public static final int _NR_NA = 0;
  public static final subnetworkConnection.NetworkRouted_T NR_NA = new subnetworkConnection.NetworkRouted_T(_NR_NA);
  public static final int _NR_NO = 1;
  public static final subnetworkConnection.NetworkRouted_T NR_NO = new subnetworkConnection.NetworkRouted_T(_NR_NO);
  public static final int _NR_YES = 2;
  public static final subnetworkConnection.NetworkRouted_T NR_YES = new subnetworkConnection.NetworkRouted_T(_NR_YES);

  public int value ()
  {
    return __value;
  }

  public static subnetworkConnection.NetworkRouted_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected NetworkRouted_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class NetworkRouted_T
