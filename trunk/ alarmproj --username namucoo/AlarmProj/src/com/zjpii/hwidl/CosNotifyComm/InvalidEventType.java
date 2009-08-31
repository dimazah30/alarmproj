package CosNotifyComm;


/**
* CosNotifyComm/InvalidEventType.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/

public final class InvalidEventType extends org.omg.CORBA.UserException
{
  public CosNotification.EventType type = null;

  public InvalidEventType ()
  {
    super(InvalidEventTypeHelper.id());
  } // ctor

  public InvalidEventType (CosNotification.EventType _type)
  {
    super(InvalidEventTypeHelper.id());
    type = _type;
  } // ctor


  public InvalidEventType (String $reason, CosNotification.EventType _type)
  {
    super(InvalidEventTypeHelper.id() + "  " + $reason);
    type = _type;
  } // ctor

} // class InvalidEventType
