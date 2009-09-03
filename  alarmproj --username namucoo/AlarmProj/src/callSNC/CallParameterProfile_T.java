package callSNC;


/**
* callSNC/CallParameterProfile_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class CallParameterProfile_T implements org.omg.CORBA.portable.IDLEntity
{
  public String severelyDegradedThreshold = null;
  public String degradedTreshold = null;
  public String classOfService = null;
  public globaldefs.NameAndStringValue_T classOfServiceParameters[] = null;

  public CallParameterProfile_T ()
  {
  } // ctor

  public CallParameterProfile_T (String _severelyDegradedThreshold, String _degradedTreshold, String _classOfService, globaldefs.NameAndStringValue_T[] _classOfServiceParameters)
  {
    severelyDegradedThreshold = _severelyDegradedThreshold;
    degradedTreshold = _degradedTreshold;
    classOfService = _classOfService;
    classOfServiceParameters = _classOfServiceParameters;
  } // ctor

} // class CallParameterProfile_T
