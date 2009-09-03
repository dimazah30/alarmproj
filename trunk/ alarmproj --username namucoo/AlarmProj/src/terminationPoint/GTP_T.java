package terminationPoint;


/**
* terminationPoint/GTP_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� terminationPoint.idl
* 2009��9��2�� ������ ����03ʱ27��55�� CST
*/

public final class GTP_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public boolean alarmReportingIndicator = false;
  public globaldefs.NameAndStringValue_T listOfTPs[][] = null;
  public terminationPoint.TPConnectionState_T gtpConnectionState = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public GTP_T ()
  {
  } // ctor

  public GTP_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, boolean _alarmReportingIndicator, globaldefs.NameAndStringValue_T[][] _listOfTPs, terminationPoint.TPConnectionState_T _gtpConnectionState, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    alarmReportingIndicator = _alarmReportingIndicator;
    listOfTPs = _listOfTPs;
    gtpConnectionState = _gtpConnectionState;
    additionalInfo = _additionalInfo;
  } // ctor

} // class GTP_T
