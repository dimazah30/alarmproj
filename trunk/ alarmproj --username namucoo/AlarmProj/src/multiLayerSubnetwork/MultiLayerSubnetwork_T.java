package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/MultiLayerSubnetwork_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
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
