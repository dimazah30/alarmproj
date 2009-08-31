package EPIRPSystem;


/**
* EPIRPSystem/ReleaseIRPReference.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class ReleaseIRPReference extends org.omg.CORBA.UserException
{
  public String reason = null;

  public ReleaseIRPReference ()
  {
    super(ReleaseIRPReferenceHelper.id());
  } // ctor

  public ReleaseIRPReference (String _reason)
  {
    super(ReleaseIRPReferenceHelper.id());
    reason = _reason;
  } // ctor


  public ReleaseIRPReference (String $reason, String _reason)
  {
    super(ReleaseIRPReferenceHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class ReleaseIRPReference
