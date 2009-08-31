package NotificationIRPSystem;


/**
* NotificationIRPSystem/DetachException.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分29秒 CST
*/

public final class DetachException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public DetachException ()
  {
    super(DetachExceptionHelper.id());
  } // ctor

  public DetachException (String _reason)
  {
    super(DetachExceptionHelper.id());
    reason = _reason;
  } // ctor


  public DetachException (String $reason, String _reason)
  {
    super(DetachExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class DetachException
