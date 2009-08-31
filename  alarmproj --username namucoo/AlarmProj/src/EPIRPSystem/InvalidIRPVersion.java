package EPIRPSystem;


/**
* EPIRPSystem/InvalidIRPVersion.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class InvalidIRPVersion extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidIRPVersion ()
  {
    super(InvalidIRPVersionHelper.id());
  } // ctor

  public InvalidIRPVersion (String _reason)
  {
    super(InvalidIRPVersionHelper.id());
    reason = _reason;
  } // ctor


  public InvalidIRPVersion (String $reason, String _reason)
  {
    super(InvalidIRPVersionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidIRPVersion
