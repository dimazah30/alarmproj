package CosNotification;


/**
* CosNotification/FixedEventHeader.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class FixedEventHeader implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.EventType event_type = null;
  public String event_name = null;

  public FixedEventHeader ()
  {
  } // ctor

  public FixedEventHeader (CosNotification.EventType _event_type, String _event_name)
  {
    event_type = _event_type;
    event_name = _event_name;
  } // ctor

} // class FixedEventHeader
