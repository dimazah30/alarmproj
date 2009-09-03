package topologicalLink;


/**
* topologicalLink/TopologicalLink_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 topologicalLink.idl
* 2009年9月2日 星期三 下午03时27分49秒 CST
*/

public final class TopologicalLink_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public globaldefs.ConnectionDirection_T direction = null;
  public short rate = (short)0;
  public globaldefs.NameAndStringValue_T aEndTP[] = null;
  public globaldefs.NameAndStringValue_T zEndTP[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public TopologicalLink_T ()
  {
  } // ctor

  public TopologicalLink_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, globaldefs.ConnectionDirection_T _direction, short _rate, globaldefs.NameAndStringValue_T[] _aEndTP, globaldefs.NameAndStringValue_T[] _zEndTP, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    direction = _direction;
    rate = _rate;
    aEndTP = _aEndTP;
    zEndTP = _zEndTP;
    additionalInfo = _additionalInfo;
  } // ctor

} // class TopologicalLink_T
