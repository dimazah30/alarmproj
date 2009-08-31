package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmListAlignmentRequirementType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates if the AlarmList alignment is required.
   */
public class AlarmListAlignmentRequirementType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static AlarmIRPConstDefs.AlarmListAlignmentRequirementType[] __array = new AlarmIRPConstDefs.AlarmListAlignmentRequirementType [__size];

  public static final int _Required = 0;
  public static final AlarmIRPConstDefs.AlarmListAlignmentRequirementType Required = new AlarmIRPConstDefs.AlarmListAlignmentRequirementType(_Required);
  public static final int _NotRequired = 1;
  public static final AlarmIRPConstDefs.AlarmListAlignmentRequirementType NotRequired = new AlarmIRPConstDefs.AlarmListAlignmentRequirementType(_NotRequired);

  public int value ()
  {
    return __value;
  }

  public static AlarmIRPConstDefs.AlarmListAlignmentRequirementType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AlarmListAlignmentRequirementType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AlarmListAlignmentRequirementType
