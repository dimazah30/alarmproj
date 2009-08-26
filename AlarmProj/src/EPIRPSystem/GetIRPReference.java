package EPIRPSystem;


/**
* EPIRPSystem/GetIRPReference.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class GetIRPReference extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetIRPReference ()
  {
    super(GetIRPReferenceHelper.id());
  } // ctor

  public GetIRPReference (String _reason)
  {
    super(GetIRPReferenceHelper.id());
    reason = _reason;
  } // ctor


  public GetIRPReference (String $reason, String _reason)
  {
    super(GetIRPReferenceHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetIRPReference
