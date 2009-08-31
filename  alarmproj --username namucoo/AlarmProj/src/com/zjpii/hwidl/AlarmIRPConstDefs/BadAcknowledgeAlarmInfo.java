package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/BadAcknowledgeAlarmInfo.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

public final class BadAcknowledgeAlarmInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String alarm_information_reference = null;
  public AlarmIRPConstDefs.AcknowledgeFailureCategories failure_category = null;
  public String reason = null;

  public BadAcknowledgeAlarmInfo ()
  {
  } // ctor

  public BadAcknowledgeAlarmInfo (String _alarm_information_reference, AlarmIRPConstDefs.AcknowledgeFailureCategories _failure_category, String _reason)
  {
    alarm_information_reference = _alarm_information_reference;
    failure_category = _failure_category;
    reason = _reason;
  } // ctor

} // class BadAcknowledgeAlarmInfo
