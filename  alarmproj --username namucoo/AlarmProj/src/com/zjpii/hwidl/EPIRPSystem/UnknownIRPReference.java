package EPIRPSystem;


/**
* EPIRPSystem/UnknownIRPReference.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class UnknownIRPReference extends org.omg.CORBA.UserException
{
  public String reason = null;

  public UnknownIRPReference ()
  {
    super(UnknownIRPReferenceHelper.id());
  } // ctor

  public UnknownIRPReference (String _reason)
  {
    super(UnknownIRPReferenceHelper.id());
    reason = _reason;
  } // ctor


  public UnknownIRPReference (String $reason, String _reason)
  {
    super(UnknownIRPReferenceHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class UnknownIRPReference
