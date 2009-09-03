package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/MultiLayerSubnetwork_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/

public final class MultiLayerSubnetwork_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public multiLayerSubnetwork.Topology_T subnetworkType = null;
  public short supportedRates[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public MultiLayerSubnetwork_T ()
  {
  } // ctor

  public MultiLayerSubnetwork_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, multiLayerSubnetwork.Topology_T _subnetworkType, short[] _supportedRates, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    subnetworkType = _subnetworkType;
    supportedRates = _supportedRates;
    additionalInfo = _additionalInfo;
  } // ctor

} // class MultiLayerSubnetwork_T
