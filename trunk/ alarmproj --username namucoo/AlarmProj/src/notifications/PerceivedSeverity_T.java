package notifications;


/**
* notifications/PerceivedSeverity_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>The PerceivedSeverity_T values are consistent
   * with ITU-T X.733 definitions.</p>
   * 
   **/
public class PerceivedSeverity_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 6;
  private static notifications.PerceivedSeverity_T[] __array = new notifications.PerceivedSeverity_T [__size];

  public static final int _PS_INDETERMINATE = 0;
  public static final notifications.PerceivedSeverity_T PS_INDETERMINATE = new notifications.PerceivedSeverity_T(_PS_INDETERMINATE);
  public static final int _PS_CRITICAL = 1;
  public static final notifications.PerceivedSeverity_T PS_CRITICAL = new notifications.PerceivedSeverity_T(_PS_CRITICAL);
  public static final int _PS_MAJOR = 2;
  public static final notifications.PerceivedSeverity_T PS_MAJOR = new notifications.PerceivedSeverity_T(_PS_MAJOR);
  public static final int _PS_MINOR = 3;
  public static final notifications.PerceivedSeverity_T PS_MINOR = new notifications.PerceivedSeverity_T(_PS_MINOR);
  public static final int _PS_WARNING = 4;
  public static final notifications.PerceivedSeverity_T PS_WARNING = new notifications.PerceivedSeverity_T(_PS_WARNING);
  public static final int _PS_CLEARED = 5;
  public static final notifications.PerceivedSeverity_T PS_CLEARED = new notifications.PerceivedSeverity_T(_PS_CLEARED);

  public int value ()
  {
    return __value;
  }

  public static notifications.PerceivedSeverity_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected PerceivedSeverity_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class PerceivedSeverity_T
