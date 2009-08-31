package NotificationIRPSystem;


/**
* NotificationIRPSystem/DetachException.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
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
