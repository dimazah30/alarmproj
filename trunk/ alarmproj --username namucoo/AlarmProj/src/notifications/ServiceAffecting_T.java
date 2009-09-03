package notifications;


/**
* notifications/ServiceAffecting_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>ServiceAffecting_T describes the impact of a fault on monitored 
   * entities</p>
   * <br>SA_UNKNOWN: The EMS cannot determine if the condition 
   *  affects service or not.<br>
   * <br>SA_SERVICE_AFFECTING: The EMS determines that the condition affects 
   * service.<br>
   * <br>SA_NON_SERVICE_AFFECTING: The EMS determines that the condition does 
   *  not affect service.<br>
   **/
public class ServiceAffecting_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static notifications.ServiceAffecting_T[] __array = new notifications.ServiceAffecting_T [__size];

  public static final int _SA_UNKNOWN = 0;
  public static final notifications.ServiceAffecting_T SA_UNKNOWN = new notifications.ServiceAffecting_T(_SA_UNKNOWN);
  public static final int _SA_SERVICE_AFFECTING = 1;
  public static final notifications.ServiceAffecting_T SA_SERVICE_AFFECTING = new notifications.ServiceAffecting_T(_SA_SERVICE_AFFECTING);
  public static final int _SA_NON_SERVICE_AFFECTING = 2;
  public static final notifications.ServiceAffecting_T SA_NON_SERVICE_AFFECTING = new notifications.ServiceAffecting_T(_SA_NON_SERVICE_AFFECTING);

  public int value ()
  {
    return __value;
  }

  public static notifications.ServiceAffecting_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ServiceAffecting_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ServiceAffecting_T
