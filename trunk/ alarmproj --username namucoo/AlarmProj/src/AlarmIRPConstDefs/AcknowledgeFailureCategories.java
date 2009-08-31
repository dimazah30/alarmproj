package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AcknowledgeFailureCategories.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates the reason for an alarm acknowledgement to have failed:
     - The specified Alarm Information is absent from the Alarm List
     - The Perceived Severity to be acknowledged has changed and/or is different
       within the Alarm List
     - The acknowledgement failed for some other reason
   */
public class AcknowledgeFailureCategories implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static AlarmIRPConstDefs.AcknowledgeFailureCategories[] __array = new AlarmIRPConstDefs.AcknowledgeFailureCategories [__size];

  public static final int _UnknownAlarmId = 0;
  public static final AlarmIRPConstDefs.AcknowledgeFailureCategories UnknownAlarmId = new AlarmIRPConstDefs.AcknowledgeFailureCategories(_UnknownAlarmId);
  public static final int _WrongPerceivedSeverity = 1;
  public static final AlarmIRPConstDefs.AcknowledgeFailureCategories WrongPerceivedSeverity = new AlarmIRPConstDefs.AcknowledgeFailureCategories(_WrongPerceivedSeverity);
  public static final int _AcknowledgmentFailed = 2;
  public static final AlarmIRPConstDefs.AcknowledgeFailureCategories AcknowledgmentFailed = new AlarmIRPConstDefs.AcknowledgeFailureCategories(_AcknowledgmentFailed);

  public int value ()
  {
    return __value;
  }

  public static AlarmIRPConstDefs.AcknowledgeFailureCategories from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AcknowledgeFailureCategories (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AcknowledgeFailureCategories
