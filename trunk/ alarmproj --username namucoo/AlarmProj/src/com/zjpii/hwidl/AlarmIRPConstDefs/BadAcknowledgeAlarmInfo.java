package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/BadAcknowledgeAlarmInfo.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
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
