package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/TPPoolCreateData_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
*/

public final class TPPoolCreateData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String userLabel = null;
  public boolean forceUniqueness = false;
  public String owner = null;
  public multiLayerSubnetwork.MultiLayerSubnetwork_T containingMLSN = null;
  public globaldefs.NameAndStringValue_T containedMembers[][] = null;
  public transmissionParameters.LayeredParameters_T transmissionParams[] = null;
  public String descriptionOfUse = null;
  public globaldefs.NameAndStringValue_T additionalCreationInfo[] = null;

  public TPPoolCreateData_T ()
  {
  } // ctor

  public TPPoolCreateData_T (String _userLabel, boolean _forceUniqueness, String _owner, multiLayerSubnetwork.MultiLayerSubnetwork_T _containingMLSN, globaldefs.NameAndStringValue_T[][] _containedMembers, transmissionParameters.LayeredParameters_T[] _transmissionParams, String _descriptionOfUse, globaldefs.NameAndStringValue_T[] _additionalCreationInfo)
  {
    userLabel = _userLabel;
    forceUniqueness = _forceUniqueness;
    owner = _owner;
    containingMLSN = _containingMLSN;
    containedMembers = _containedMembers;
    transmissionParams = _transmissionParams;
    descriptionOfUse = _descriptionOfUse;
    additionalCreationInfo = _additionalCreationInfo;
  } // ctor

} // class TPPoolCreateData_T
