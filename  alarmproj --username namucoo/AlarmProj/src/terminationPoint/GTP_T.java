package terminationPoint;


/**
* terminationPoint/GTP_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
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
