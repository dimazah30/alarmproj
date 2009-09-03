package subnetworkConnection;


/**
* subnetworkConnection/SNCCreateData_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

public final class SNCCreateData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String userLabel = null;
  public boolean forceUniqueness = false;
  public String owner = null;
  public globaldefs.ConnectionDirection_T direction = null;
  public subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel = null;
  public subnetworkConnection.ProtectionEffort_T protectionEffort = null;
  public subnetworkConnection.Reroute_T rerouteAllowed = null;
  public subnetworkConnection.NetworkRouted_T networkRouted = null;
  public subnetworkConnection.SNCType_T sncType = null;
  public short layerRate = (short)0;
  public subnetworkConnection.CrossConnect_T ccInclusions[] = null;
  public globaldefs.NameAndStringValue_T neTpInclusions[][] = null;
  public boolean fullRoute = false;
  public globaldefs.NameAndStringValue_T neTpSncExclusions[][] = null;
  public globaldefs.NameAndStringValue_T aEnd[][] = null;
  public globaldefs.NameAndStringValue_T zEnd[][] = null;
  public globaldefs.NameAndStringValue_T additionalCreationInfo[] = null;

  public SNCCreateData_T ()
  {
  } // ctor

  public SNCCreateData_T (String _userLabel, boolean _forceUniqueness, String _owner, globaldefs.ConnectionDirection_T _direction, subnetworkConnection.StaticProtectionLevel_T _staticProtectionLevel, subnetworkConnection.ProtectionEffort_T _protectionEffort, subnetworkConnection.Reroute_T _rerouteAllowed, subnetworkConnection.NetworkRouted_T _networkRouted, subnetworkConnection.SNCType_T _sncType, short _layerRate, subnetworkConnection.CrossConnect_T[] _ccInclusions, globaldefs.NameAndStringValue_T[][] _neTpInclusions, boolean _fullRoute, globaldefs.NameAndStringValue_T[][] _neTpSncExclusions, globaldefs.NameAndStringValue_T[][] _aEnd, globaldefs.NameAndStringValue_T[][] _zEnd, globaldefs.NameAndStringValue_T[] _additionalCreationInfo)
  {
    userLabel = _userLabel;
    forceUniqueness = _forceUniqueness;
    owner = _owner;
    direction = _direction;
    staticProtectionLevel = _staticProtectionLevel;
    protectionEffort = _protectionEffort;
    rerouteAllowed = _rerouteAllowed;
    networkRouted = _networkRouted;
    sncType = _sncType;
    layerRate = _layerRate;
    ccInclusions = _ccInclusions;
    neTpInclusions = _neTpInclusions;
    fullRoute = _fullRoute;
    neTpSncExclusions = _neTpSncExclusions;
    aEnd = _aEnd;
    zEnd = _zEnd;
    additionalCreationInfo = _additionalCreationInfo;
  } // ctor

} // class SNCCreateData_T
