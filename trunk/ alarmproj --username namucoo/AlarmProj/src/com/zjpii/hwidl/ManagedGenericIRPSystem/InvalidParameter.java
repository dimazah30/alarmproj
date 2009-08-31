package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/InvalidParameter.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分17秒 CST
*/


/*
   Exception thrown when an invalid parameter value is passed.
   The parameter shall be the actual parameter name.
   */
public final class InvalidParameter extends org.omg.CORBA.UserException
{
  public String parameter = null;

  public InvalidParameter ()
  {
    super(InvalidParameterHelper.id());
  } // ctor

  public InvalidParameter (String _parameter)
  {
    super(InvalidParameterHelper.id());
    parameter = _parameter;
  } // ctor


  public InvalidParameter (String $reason, String _parameter)
  {
    super(InvalidParameterHelper.id() + "  " + $reason);
    parameter = _parameter;
  } // ctor

} // class InvalidParameter
