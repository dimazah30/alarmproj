package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationIdAndSev.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
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
