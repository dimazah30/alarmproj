package subnetworkConnection;


/**
* subnetworkConnection/SNCModifyData_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

public final class SNCModifyData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String userLabel = null;
  public boolean forceUniqueness = false;
  public String owner = null;
  public globaldefs.ConnectionDirection_T direction = null;
  public String modifyType = null;
  public boolean retainOldSNC = false;
  public boolean modifyServers_allowed = false;
  public subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel = null;
  public subnetworkConnection.ProtectionEffort_T protectionEffort = null;
  public subnetworkConnection.Reroute_T rerouteAllowed = null;
  public subnetworkConnection.NetworkRouted_T networkRouted = null;
  public subnetworkConnection.SNCType_T sncType = null;
  public short layerRate = (short)0;
  public subnetworkConnection.RouteDescriptor_T addedOrNewRoute[] = null;
  public subnetworkConnection.RouteDescriptor_T removedRoute[] = null;
  public globaldefs.NameAndStringValue_T neTpInclusions[][] = null;
  public boolean fullRoute = false;
  public globaldefs.NameAndStringValue_T neTpSncExclusions[][] = null;
  public globaldefs.NameAndStringValue_T aEnd[][] = null;
  public globaldefs.NameAndStringValue_T zEnd[][] = null;
  public globaldefs.NameAndStringValue_T additionalCreationInfo[] = null;

  public SNCModifyData_T ()
  {
  } // ctor

  public SNCModifyData_T (String _userLabel, boolean _forceUniqueness, String _owner, globaldefs.ConnectionDirection_T _direction, String _modifyType, boolean _retainOldSNC, boolean _modifyServers_allowed, subnetworkConnection.StaticProtectionLevel_T _staticProtectionLevel, subnetworkConnection.ProtectionEffort_T _protectionEffort, subnetworkConnection.Reroute_T _rerouteAllowed, subnetworkConnection.NetworkRouted_T _networkRouted, subnetworkConnection.SNCType_T _sncType, short _layerRate, subnetworkConnection.RouteDescriptor_T[] _addedOrNewRoute, subnetworkConnection.RouteDescriptor_T[] _removedRoute, globaldefs.NameAndStringValue_T[][] _neTpInclusions, boolean _fullRoute, globaldefs.NameAndStringValue_T[][] _neTpSncExclusions, globaldefs.NameAndStringValue_T[][] _aEnd, globaldefs.NameAndStringValue_T[][] _zEnd, globaldefs.NameAndStringValue_T[] _additionalCreationInfo)
  {
    userLabel = _userLabel;
    forceUniqueness = _forceUniqueness;
    owner = _owner;
    direction = _direction;
    modifyType = _modifyType;
    retainOldSNC = _retainOldSNC;
    modifyServers_allowed = _modifyServers_allowed;
    staticProtectionLevel = _staticProtectionLevel;
    protectionEffort = _protectionEffort;
    rerouteAllowed = _rerouteAllowed;
    networkRouted = _networkRouted;
    sncType = _sncType;
    layerRate = _layerRate;
    addedOrNewRoute = _addedOrNewRoute;
    removedRoute = _removedRoute;
    neTpInclusions = _neTpInclusions;
    fullRoute = _fullRoute;
    neTpSncExclusions = _neTpSncExclusions;
    aEnd = _aEnd;
    zEnd = _zEnd;
    additionalCreationInfo = _additionalCreationInfo;
  } // ctor

} // class SNCModifyData_T
