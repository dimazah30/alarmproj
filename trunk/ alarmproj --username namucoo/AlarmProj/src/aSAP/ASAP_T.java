package aSAP;


/**
* aSAP/ASAP_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� aSAP.idl
* 2009��9��2�� ������ ����03ʱ25��09�� CST
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
