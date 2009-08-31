package EPIRPSystem;


/**
* EPIRPSystem/GetEPIRPNotificationProfile.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class GetEPIRPNotificationProfile extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetEPIRPNotificationProfile ()
  {
    super(GetEPIRPNotificationProfileHelper.id());
  } // ctor

  public GetEPIRPNotificationProfile (String _reason)
  {
    super(GetEPIRPNotificationProfileHelper.id());
    reason = _reason;
  } // ctor


  public GetEPIRPNotificationProfile (String $reason, String _reason)
  {
    super(GetEPIRPNotificationProfileHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetEPIRPNotificationProfile
