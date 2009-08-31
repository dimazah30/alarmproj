package NotificationIRPSystem;


/**
* NotificationIRPSystem/Attach.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class Attach extends org.omg.CORBA.UserException
{
  public String reason = null;

  public Attach ()
  {
    super(AttachHelper.id());
  } // ctor

  public Attach (String _reason)
  {
    super(AttachHelper.id());
    reason = _reason;
  } // ctor


  public Attach (String $reason, String _reason)
  {
    super(AttachHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class Attach
