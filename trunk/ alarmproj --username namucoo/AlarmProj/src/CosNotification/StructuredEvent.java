package CosNotification;


/**
* CosNotification/StructuredEvent.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class StructuredEvent implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.EventHeader header = null;
  public CosNotification.Property filterable_data[] = null;
  public org.omg.CORBA.Any remainder_of_body = null;

  public StructuredEvent ()
  {
  } // ctor

  public StructuredEvent (CosNotification.EventHeader _header, CosNotification.Property[] _filterable_data, org.omg.CORBA.Any _remainder_of_body)
  {
    header = _header;
    filterable_data = _filterable_data;
    remainder_of_body = _remainder_of_body;
  } // ctor

} // class StructuredEvent
