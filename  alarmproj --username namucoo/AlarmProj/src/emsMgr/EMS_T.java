package emsMgr;


/**
* emsMgr/EMS_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 emsMgr.idl
* 2009年9月2日 星期三 下午12时51分25秒 CST
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
