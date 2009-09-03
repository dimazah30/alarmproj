package subnetworkConnection;


/**
* subnetworkConnection/CrossConnect_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
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
