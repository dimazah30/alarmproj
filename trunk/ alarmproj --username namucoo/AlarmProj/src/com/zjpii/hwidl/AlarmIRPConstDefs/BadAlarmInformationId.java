package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/BadAlarmInformationId.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
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
