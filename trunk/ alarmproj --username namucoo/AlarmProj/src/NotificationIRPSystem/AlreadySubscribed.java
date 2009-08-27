package NotificationIRPSystem;


/**
* NotificationIRPSystem/AlreadySubscribed.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

public final class AlreadySubscribed extends org.omg.CORBA.UserException
{

  public AlreadySubscribed ()
  {
    super(AlreadySubscribedHelper.id());
  } // ctor


  public AlreadySubscribed (String $reason)
  {
    super(AlreadySubscribedHelper.id() + "  " + $reason);
  } // ctor

} // class AlreadySubscribed
