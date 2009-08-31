package CosNotification;


/**
* CosNotification/EventType.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class EventType implements org.omg.CORBA.portable.IDLEntity
{
  public String domain_name = null;
  public String type_name = null;

  public EventType ()
  {
  } // ctor

  public EventType (String _domain_name, String _type_name)
  {
    domain_name = _domain_name;
    type_name = _type_name;
  } // ctor

} // class EventType
