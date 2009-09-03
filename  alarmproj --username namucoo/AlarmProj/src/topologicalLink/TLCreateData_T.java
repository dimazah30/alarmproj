package topologicalLink;


/**
* topologicalLink/TLCreateData_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 topologicalLink.idl
* 2009年9月2日 星期三 下午03时27分49秒 CST
*/

public final class TLCreateData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String userLabel = null;
  public boolean forceUniqueness = false;
  public String owner = null;
  public globaldefs.ConnectionDirection_T direction = null;
  public short rate = (short)0;
  public globaldefs.NameAndStringValue_T aEndTP[] = null;
  public globaldefs.NameAndStringValue_T zEndTP[] = null;
  public globaldefs.NameAndStringValue_T additionalCreationInfo[] = null;

  public TLCreateData_T ()
  {
  } // ctor

  public TLCreateData_T (String _userLabel, boolean _forceUniqueness, String _owner, globaldefs.ConnectionDirection_T _direction, short _rate, globaldefs.NameAndStringValue_T[] _aEndTP, globaldefs.NameAndStringValue_T[] _zEndTP, globaldefs.NameAndStringValue_T[] _additionalCreationInfo)
  {
    userLabel = _userLabel;
    forceUniqueness = _forceUniqueness;
    owner = _owner;
    direction = _direction;
    rate = _rate;
    aEndTP = _aEndTP;
    zEndTP = _zEndTP;
    additionalCreationInfo = _additionalCreationInfo;
  } // ctor

} // class TLCreateData_T
