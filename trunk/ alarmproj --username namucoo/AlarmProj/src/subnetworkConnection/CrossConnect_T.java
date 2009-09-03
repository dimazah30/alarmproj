package subnetworkConnection;


/**
* subnetworkConnection/CrossConnect_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/

public final class CrossConnect_T implements org.omg.CORBA.portable.IDLEntity
{
  public boolean active = false;
  public globaldefs.ConnectionDirection_T direction = null;
  public subnetworkConnection.SNCType_T ccType = null;
  public globaldefs.NameAndStringValue_T aEndNameList[][] = null;
  public globaldefs.NameAndStringValue_T zEndNameList[][] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public CrossConnect_T ()
  {
  } // ctor

  public CrossConnect_T (boolean _active, globaldefs.ConnectionDirection_T _direction, subnetworkConnection.SNCType_T _ccType, globaldefs.NameAndStringValue_T[][] _aEndNameList, globaldefs.NameAndStringValue_T[][] _zEndNameList, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    active = _active;
    direction = _direction;
    ccType = _ccType;
    aEndNameList = _aEndNameList;
    zEndNameList = _zEndNameList;
    additionalInfo = _additionalInfo;
  } // ctor

} // class CrossConnect_T
