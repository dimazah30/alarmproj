package callSNC;


/**
* callSNC/CallCreateData_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallCreateData_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T callName[] = null;
  public String userLabel = null;
  public boolean forceUniqueness = false;
  public String owner = null;
  public String networkAccessDomain = null;
  public callSNC.CallEnd_T aEnd = null;
  public callSNC.CallEnd_T zEnd = null;
  public callSNC.CallParameterProfile_T callParameters = null;
  public callSNC.Diversity_T callDiversity = null;
  public globaldefs.NameAndStringValue_T additionalCreationInfo[] = null;

  public CallCreateData_T ()
  {
  } // ctor

  public CallCreateData_T (globaldefs.NameAndStringValue_T[] _callName, String _userLabel, boolean _forceUniqueness, String _owner, String _networkAccessDomain, callSNC.CallEnd_T _aEnd, callSNC.CallEnd_T _zEnd, callSNC.CallParameterProfile_T _callParameters, callSNC.Diversity_T _callDiversity, globaldefs.NameAndStringValue_T[] _additionalCreationInfo)
  {
    callName = _callName;
    userLabel = _userLabel;
    forceUniqueness = _forceUniqueness;
    owner = _owner;
    networkAccessDomain = _networkAccessDomain;
    aEnd = _aEnd;
    zEnd = _zEnd;
    callParameters = _callParameters;
    callDiversity = _callDiversity;
    additionalCreationInfo = _additionalCreationInfo;
  } // ctor

} // class CallCreateData_T
