package EPIRPSystem;


/**
* EPIRPSystem/GetEPIRPOperationsProfile.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class GetEPIRPOperationsProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPOperationsProfile ()
  {
    super(GetEPIRPOperationsProfileHelper.id());
  } // ctor

  public GetEPIRPOperationsProfile (String _reason)
  {
    super(GetEPIRPOperationsProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPOperationsProfile (String $reason, String _reason)
  {
    super(GetEPIRPOperationsProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPOperationsProfile
