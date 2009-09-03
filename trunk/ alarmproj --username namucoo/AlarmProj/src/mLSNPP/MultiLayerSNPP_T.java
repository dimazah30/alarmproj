package mLSNPP;


/**
* mLSNPP/MultiLayerSNPP_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class MultiLayerSNPP_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public terminationPoint.Directionality_T direction = null;
  public mLSNPP.LayeredSNPP_T layeredSNPPList[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public MultiLayerSNPP_T ()
  {
  } // ctor

  public MultiLayerSNPP_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, terminationPoint.Directionality_T _direction, mLSNPP.LayeredSNPP_T[] _layeredSNPPList, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    direction = _direction;
    layeredSNPPList = _layeredSNPPList;
    additionalInfo = _additionalInfo;
  } // ctor

} // class MultiLayerSNPP_T
