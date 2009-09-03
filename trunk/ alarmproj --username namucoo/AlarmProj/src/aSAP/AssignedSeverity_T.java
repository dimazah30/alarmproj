package aSAP;


/**
* aSAP/AssignedSeverity_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/


/**
   * <p>Alarm notifications include a severity. The severity is defined in
   * notifications::PerceivedSeverity_T .</p>
   *
   * <p>The assigned severity is allocated to a probable cause using the
   * alarm severity assignment profile (ASAP). The identified probable cause  
   * should be raised with the assigned severity. The assignment of severities 
   * is extended beyond notifications::PerceivedSeverity_T to cover the case 
   * where:<ul>
   * <li>no alarm should be raised: "AS_NONALARMED"</li>
   * <li>the EMS/ME is free to make a choice based upon its local criteria: 
   * "AS_FREE_CHOICE"</li></ul></p>
   **/
public class AssignedSeverity_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 7;
  private static aSAP.AssignedSeverity_T[] __array = new aSAP.AssignedSeverity_T [__size];

  public static final int _AS_INDETERMINATE = 0;
  public static final aSAP.AssignedSeverity_T AS_INDETERMINATE = new aSAP.AssignedSeverity_T(_AS_INDETERMINATE);
  public static final int _AS_CRITICAL = 1;
  public static final aSAP.AssignedSeverity_T AS_CRITICAL = new aSAP.AssignedSeverity_T(_AS_CRITICAL);
  public static final int _AS_MAJOR = 2;
  public static final aSAP.AssignedSeverity_T AS_MAJOR = new aSAP.AssignedSeverity_T(_AS_MAJOR);
  public static final int _AS_MINOR = 3;
  public static final aSAP.AssignedSeverity_T AS_MINOR = new aSAP.AssignedSeverity_T(_AS_MINOR);
  public static final int _AS_WARNING = 4;
  public static final aSAP.AssignedSeverity_T AS_WARNING = new aSAP.AssignedSeverity_T(_AS_WARNING);
  public static final int _AS_NONALARMED = 5;
  public static final aSAP.AssignedSeverity_T AS_NONALARMED = new aSAP.AssignedSeverity_T(_AS_NONALARMED);
  public static final int _AS_FREE_CHOICE = 6;
  public static final aSAP.AssignedSeverity_T AS_FREE_CHOICE = new aSAP.AssignedSeverity_T(_AS_FREE_CHOICE);

  public int value ()
  {
    return __value;
  }

  public static aSAP.AssignedSeverity_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AssignedSeverity_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AssignedSeverity_T
