package aSAP;


/**
* aSAP/ASAP_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/

public final class ASAP_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public boolean notModifiable = false;
  public aSAP.AlarmSeverityAssignment_T alarmSeverityAssignmentList[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public ASAP_T ()
  {
  } // ctor

  public ASAP_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, boolean _notModifiable, aSAP.AlarmSeverityAssignment_T[] _alarmSeverityAssignmentList, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    notModifiable = _notModifiable;
    alarmSeverityAssignmentList = _alarmSeverityAssignmentList;
    additionalInfo = _additionalInfo;
  } // ctor

} // class ASAP_T
