package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/TrendIndicationType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates if some observed condition is getting better, worse,
   or not changing.
   */
public class TrendIndicationType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static AlarmIRPConstDefs.TrendIndicationType[] __array = new AlarmIRPConstDefs.TrendIndicationType [__size];

  public static final int _LessSevere = 0;
  public static final AlarmIRPConstDefs.TrendIndicationType LessSevere = new AlarmIRPConstDefs.TrendIndicationType(_LessSevere);
  public static final int _NoChange = 1;
  public static final AlarmIRPConstDefs.TrendIndicationType NoChange = new AlarmIRPConstDefs.TrendIndicationType(_NoChange);
  public static final int _MoreSevere = 2;
  public static final AlarmIRPConstDefs.TrendIndicationType MoreSevere = new AlarmIRPConstDefs.TrendIndicationType(_MoreSevere);

  public int value ()
  {
    return __value;
  }

  public static AlarmIRPConstDefs.TrendIndicationType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected TrendIndicationType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class TrendIndicationType
