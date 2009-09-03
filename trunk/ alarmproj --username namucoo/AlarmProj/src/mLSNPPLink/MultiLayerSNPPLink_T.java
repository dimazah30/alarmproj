package mLSNPPLink;


/**
* mLSNPPLink/MultiLayerSNPPLink_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

public final class MultiLayerSNPPLink_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public globaldefs.ConnectionDirection_T direction = null;
  public globaldefs.NameAndStringValue_T aMLRAName[] = null;
  public globaldefs.NameAndStringValue_T zMLRAName[] = null;
  public String aTNAName = null;
  public String zTNAName = null;
  public String aTNAGroupName = null;
  public String zTNAGroupName = null;
  public mLSNPPLink.LayeredSNPPLink_T sNPPLinkList[] = null;
  public String interfaceType = null;
  public globaldefs.NameAndStringValue_T signallingParameters[] = null;
  public String signallingControllerIdentifier = null;
  public String signallingProtocol = null;
  public boolean signallingEnabled = false;
  public globaldefs.NameAndStringValue_T cost[] = null;
  public boolean discovered = false;
  public globaldefs.NameAndStringValue_T availability[] = null;
  public String linkSRG = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public MultiLayerSNPPLink_T ()
  {
  } // ctor

  public MultiLayerSNPPLink_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, globaldefs.ConnectionDirection_T _direction, globaldefs.NameAndStringValue_T[] _aMLRAName, globaldefs.NameAndStringValue_T[] _zMLRAName, String _aTNAName, String _zTNAName, String _aTNAGroupName, String _zTNAGroupName, mLSNPPLink.LayeredSNPPLink_T[] _sNPPLinkList, String _interfaceType, globaldefs.NameAndStringValue_T[] _signallingParameters, String _signallingControllerIdentifier, String _signallingProtocol, boolean _signallingEnabled, globaldefs.NameAndStringValue_T[] _cost, boolean _discovered, globaldefs.NameAndStringValue_T[] _availability, String _linkSRG, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    direction = _direction;
    aMLRAName = _aMLRAName;
    zMLRAName = _zMLRAName;
    aTNAName = _aTNAName;
    zTNAName = _zTNAName;
    aTNAGroupName = _aTNAGroupName;
    zTNAGroupName = _zTNAGroupName;
    sNPPLinkList = _sNPPLinkList;
    interfaceType = _interfaceType;
    signallingParameters = _signallingParameters;
    signallingControllerIdentifier = _signallingControllerIdentifier;
    signallingProtocol = _signallingProtocol;
    signallingEnabled = _signallingEnabled;
    cost = _cost;
    discovered = _discovered;
    availability = _availability;
    linkSRG = _linkSRG;
    additionalInfo = _additionalInfo;
  } // ctor

} // class MultiLayerSNPPLink_T
