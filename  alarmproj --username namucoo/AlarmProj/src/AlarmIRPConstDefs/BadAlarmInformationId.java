package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/BadAlarmInformationId.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

public final class BadAlarmInformationId implements org.omg.CORBA.portable.IDLEntity
{
  public String alarm_information_reference = null;
  public String reason = null;

  public BadAlarmInformationId ()
  {
  } // ctor

  public BadAlarmInformationId (String _alarm_information_reference, String _reason)
  {
    alarm_information_reference = _alarm_information_reference;
    reason = _reason;
  } // ctor

} // class BadAlarmInformationId
