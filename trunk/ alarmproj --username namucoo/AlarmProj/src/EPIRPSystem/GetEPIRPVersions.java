package EPIRPSystem;


/**
* EPIRPSystem/GetEPIRPVersions.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class GetEPIRPVersions extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPVersions ()
  {
    super(GetEPIRPVersionsHelper.id());
  } // ctor

  public GetEPIRPVersions (String _reason)
  {
    super(GetEPIRPVersionsHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPVersions (String $reason, String _reason)
  {
    super(GetEPIRPVersionsHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPVersions
