package EPIRPSystem;


/**
* EPIRPSystem/InvalidRequestedParameters.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class InvalidRequestedParameters extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidRequestedParameters ()
  {
    super(InvalidRequestedParametersHelper.id());
  } // ctor

  public InvalidRequestedParameters (String _reason)
  {
    super(InvalidRequestedParametersHelper.id());
    reason = _reason;
  } // ctor


  public InvalidRequestedParameters (String $reason, String _reason)
  {
    super(InvalidRequestedParametersHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidRequestedParameters
