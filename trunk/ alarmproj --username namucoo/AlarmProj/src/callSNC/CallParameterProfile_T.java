package callSNC;


/**
* callSNC/CallParameterProfile_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
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
