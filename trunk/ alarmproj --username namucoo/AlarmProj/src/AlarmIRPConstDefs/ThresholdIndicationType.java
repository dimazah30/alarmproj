package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdIndicationType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates if the threshold crossed was in the up or down direction.
   */
public class ThresholdIndicationType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static AlarmIRPConstDefs.ThresholdIndicationType[] __array = new AlarmIRPConstDefs.ThresholdIndicationType [__size];

  public static final int _Up = 0;
  public static final AlarmIRPConstDefs.ThresholdIndicationType Up = new AlarmIRPConstDefs.ThresholdIndicationType(_Up);
  public static final int _Down = 1;
  public static final AlarmIRPConstDefs.ThresholdIndicationType Down = new AlarmIRPConstDefs.ThresholdIndicationType(_Down);

  public int value ()
  {
    return __value;
  }

  public static AlarmIRPConstDefs.ThresholdIndicationType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ThresholdIndicationType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ThresholdIndicationType
