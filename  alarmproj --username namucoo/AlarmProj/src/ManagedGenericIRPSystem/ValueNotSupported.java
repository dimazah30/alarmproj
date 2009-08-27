package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/ValueNotSupported.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分17秒 CST
*/


/*
   Exception thrown when a valid but unsupported parameter value is passed.
   The parameter shall be the actual parameter name.
   */
public final class ValueNotSupported extends org.omg.CORBA.UserException
{
  public String parameter = null;

  public ValueNotSupported ()
  {
    super(ValueNotSupportedHelper.id());
  } // ctor

  public ValueNotSupported (String _parameter)
  {
    super(ValueNotSupportedHelper.id());
    parameter = _parameter;
  } // ctor


  public ValueNotSupported (String $reason, String _parameter)
  {
    super(ValueNotSupportedHelper.id() + "  " + $reason);
    parameter = _parameter;
  } // ctor

} // class ValueNotSupported
