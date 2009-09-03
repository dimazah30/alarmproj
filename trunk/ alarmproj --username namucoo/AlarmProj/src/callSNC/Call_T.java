package callSNC;


/**
* callSNC/Call_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class Call_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T callName[] = null;
  public String userLabel = null;
  public String owner = null;
  public String networkAccessDomain = null;
  public String nativeEMSName = null;
  public String callId = null;
  public String callState = null;
  public callSNC.CallEnd_T aEnd = null;
  public callSNC.CallEnd_T zEnd = null;
  public callSNC.CallParameterProfile_T callParameters = null;
  public callSNC.Diversity_T callDiversity = null;
  public String diversitySynthesis = null;
  public callSNC.DiversityInfo_T linkDiversityViolations = null;
  public callSNC.DiversityInfo_T nodeDiversityViolations = null;
  public callSNC.DiversityInfo_T linkPartialDiversityList[] = null;
  public callSNC.DiversityInfo_T nodePartialDiversityList[] = null;
  public globaldefs.NameAndStringValue_T callAdditionalInfo[] = null;

  public Call_T ()
  {
  } // ctor

  public Call_T (globaldefs.NameAndStringValue_T[] _callName, String _userLabel, String _owner, String _networkAccessDomain, String _nativeEMSName, String _callId, String _callState, callSNC.CallEnd_T _aEnd, callSNC.CallEnd_T _zEnd, callSNC.CallParameterProfile_T _callParameters, callSNC.Diversity_T _callDiversity, String _diversitySynthesis, callSNC.DiversityInfo_T _linkDiversityViolations, callSNC.DiversityInfo_T _nodeDiversityViolations, callSNC.DiversityInfo_T[] _linkPartialDiversityList, callSNC.DiversityInfo_T[] _nodePartialDiversityList, globaldefs.NameAndStringValue_T[] _callAdditionalInfo)
  {
    callName = _callName;
    userLabel = _userLabel;
    owner = _owner;
    networkAccessDomain = _networkAccessDomain;
    nativeEMSName = _nativeEMSName;
    callId = _callId;
    callState = _callState;
    aEnd = _aEnd;
    zEnd = _zEnd;
    callParameters = _callParameters;
    callDiversity = _callDiversity;
    diversitySynthesis = _diversitySynthesis;
    linkDiversityViolations = _linkDiversityViolations;
    nodeDiversityViolations = _nodeDiversityViolations;
    linkPartialDiversityList = _linkPartialDiversityList;
    nodePartialDiversityList = _nodePartialDiversityList;
    callAdditionalInfo = _callAdditionalInfo;
  } // ctor

} // class Call_T
