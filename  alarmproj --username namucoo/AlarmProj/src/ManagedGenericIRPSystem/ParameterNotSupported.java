package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/ParameterNotSupported.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月25日 星期二 下午04时08分34秒 CST
*/


/*
   Exception thrown when an unsupported optional parameter
   is passed with information.
   The parameter shall be the actual unsupported parameter name.
   */
public final class ParameterNotSupported extends org.omg.CORBA.UserException
{
  public String parameter = null;

  public ParameterNotSupported ()
  {
    super(ParameterNotSupportedHelper.id());
  } // ctor

  public ParameterNotSupported (String _parameter)
  {
    super(ParameterNotSupportedHelper.id());
    parameter = _parameter;
  } // ctor


  public ParameterNotSupported (String $reason, String _parameter)
  {
    super(ParameterNotSupportedHelper.id() + "  " + $reason);
    parameter = _parameter;
  } // ctor

} // class ParameterNotSupported
