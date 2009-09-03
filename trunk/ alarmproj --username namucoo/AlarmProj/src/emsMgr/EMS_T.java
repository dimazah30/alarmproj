package emsMgr;


/**
* emsMgr/EMS_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� emsMgr.idl
* 2009��9��2�� ������ ����12ʱ51��25�� CST
*/

public final class EMS_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public String emsVersion = null;
  public String type = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public EMS_T ()
  {
  } // ctor

  public EMS_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, String _emsVersion, String _type, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    emsVersion = _emsVersion;
    type = _type;
    additionalInfo = _additionalInfo;
  } // ctor

} // class EMS_T
