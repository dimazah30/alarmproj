package callSNC;


/**
* callSNC/CallModifyData_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallModifyData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String userLabel = null;
  public boolean forceUniqueness = false;
  public String owner = null;
  public String networkAccessDomain = null;
  public globaldefs.NameAndStringValue_T additionalModificationInfo[] = null;

  public CallModifyData_T ()
  {
  } // ctor

  public CallModifyData_T (String _userLabel, boolean _forceUniqueness, String _owner, String _networkAccessDomain, globaldefs.NameAndStringValue_T[] _additionalModificationInfo)
  {
    userLabel = _userLabel;
    forceUniqueness = _forceUniqueness;
    owner = _owner;
    networkAccessDomain = _networkAccessDomain;
    additionalModificationInfo = _additionalModificationInfo;
  } // ctor

} // class CallModifyData_T
