package notifications;


/**
* notifications/AlarmTypeQualifier_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>Used to distinguish TCA from alarm.</p> 
   **/
public class AlarmTypeQualifier_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static notifications.AlarmTypeQualifier_T[] __array = new notifications.AlarmTypeQualifier_T [__size];

  public static final int _ALARM = 0;
  public static final notifications.AlarmTypeQualifier_T ALARM = new notifications.AlarmTypeQualifier_T(_ALARM);
  public static final int _TCA = 1;
  public static final notifications.AlarmTypeQualifier_T TCA = new notifications.AlarmTypeQualifier_T(_TCA);

  public int value ()
  {
    return __value;
  }

  public static notifications.AlarmTypeQualifier_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AlarmTypeQualifier_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AlarmTypeQualifier_T
