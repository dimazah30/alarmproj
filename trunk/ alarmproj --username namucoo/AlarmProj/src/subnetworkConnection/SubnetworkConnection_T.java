package subnetworkConnection;


/**
* subnetworkConnection/SubnetworkConnection_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

public final class SubnetworkConnection_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public subnetworkConnection.SNCState_T sncState = null;
  public globaldefs.ConnectionDirection_T direction = null;
  public short rate = (short)0;
  public subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel = null;
  public subnetworkConnection.SNCType_T sncType = null;
  public subnetworkConnection.TPData_T aEnd[] = null;
  public subnetworkConnection.TPData_T zEnd[] = null;
  public subnetworkConnection.Reroute_T rerouteAllowed = null;
  public subnetworkConnection.NetworkRouted_T networkRouted = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public SubnetworkConnection_T ()
  {
  } // ctor

  public SubnetworkConnection_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, subnetworkConnection.SNCState_T _sncState, globaldefs.ConnectionDirection_T _direction, short _rate, subnetworkConnection.StaticProtectionLevel_T _staticProtectionLevel, subnetworkConnection.SNCType_T _sncType, subnetworkConnection.TPData_T[] _aEnd, subnetworkConnection.TPData_T[] _zEnd, subnetworkConnection.Reroute_T _rerouteAllowed, subnetworkConnection.NetworkRouted_T _networkRouted, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    sncState = _sncState;
    direction = _direction;
    rate = _rate;
    staticProtectionLevel = _staticProtectionLevel;
    sncType = _sncType;
    aEnd = _aEnd;
    zEnd = _zEnd;
    rerouteAllowed = _rerouteAllowed;
    networkRouted = _networkRouted;
    additionalInfo = _additionalInfo;
  } // ctor

} // class SubnetworkConnection_T
