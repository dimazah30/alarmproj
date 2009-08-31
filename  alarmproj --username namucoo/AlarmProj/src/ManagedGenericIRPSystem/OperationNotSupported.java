package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/OperationNotSupported.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月25日 星期二 下午04时08分34秒 CST
*/


/*
   Exception thrown when an unsupported optional method is called.
   */
public final class OperationNotSupported extends org.omg.CORBA.UserException
{

  public OperationNotSupported ()
  {
    super(OperationNotSupportedHelper.id());
  } // ctor


  public OperationNotSupported (String $reason)
  {
    super(OperationNotSupportedHelper.id() + "  " + $reason);
  } // ctor

} // class OperationNotSupported
