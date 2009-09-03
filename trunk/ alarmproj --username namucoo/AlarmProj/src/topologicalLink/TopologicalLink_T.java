package topologicalLink;


/**
* topologicalLink/TopologicalLink_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� topologicalLink.idl
* 2009��9��2�� ������ ����03ʱ27��49�� CST
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
