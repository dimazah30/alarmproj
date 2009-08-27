package EPIRPSystem;


/**
* EPIRPSystem/InvalidRequestedParameters.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
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
