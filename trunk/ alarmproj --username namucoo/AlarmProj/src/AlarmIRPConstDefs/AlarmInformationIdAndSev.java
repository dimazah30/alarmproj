package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationIdAndSev.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AlarmInformationIdAndSev implements org.omg.CORBA.portable.IDLEntity
{
  public String alarm_information_reference = null;
  public ManagedGenericIRPConstDefs.ShortTypeOpt perceived_severity = null;

  public AlarmInformationIdAndSev ()
  {
  } // ctor

  public AlarmInformationIdAndSev (String _alarm_information_reference, ManagedGenericIRPConstDefs.ShortTypeOpt _perceived_severity)
  {
    alarm_information_reference = _alarm_information_reference;
    perceived_severity = _perceived_severity;
  } // ctor

} // class AlarmInformationIdAndSev
