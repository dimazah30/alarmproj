package aSAP;


/**
* aSAP/ASAPCreateModifyData_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/

public final class ASAPCreateModifyData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String userLabel = null;
  public boolean forceUniqueness = false;
  public String owner = null;
  public aSAP.AlarmSeverityAssignment_T alarmSeverityAssignmentList[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public ASAPCreateModifyData_T ()
  {
  } // ctor

  public ASAPCreateModifyData_T (String _userLabel, boolean _forceUniqueness, String _owner, aSAP.AlarmSeverityAssignment_T[] _alarmSeverityAssignmentList, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    userLabel = _userLabel;
    forceUniqueness = _forceUniqueness;
    owner = _owner;
    alarmSeverityAssignmentList = _alarmSeverityAssignmentList;
    additionalInfo = _additionalInfo;
  } // ctor

} // class ASAPCreateModifyData_T
