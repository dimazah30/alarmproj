package CosNotification;


/**
* CosNotification/EventHeader.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class EventHeader implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.FixedEventHeader fixed_header = null;
  public CosNotification.Property variable_header[] = null;

  public EventHeader ()
  {
  } // ctor

  public EventHeader (CosNotification.FixedEventHeader _fixed_header, CosNotification.Property[] _variable_header)
  {
    fixed_header = _fixed_header;
    variable_header = _variable_header;
  } // ctor

} // class EventHeader
