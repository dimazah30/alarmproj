package CosNotification;


/**
* CosNotification/PropertyError.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class PropertyError implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.QoSError_code code = null;
  public String name = null;
  public CosNotification.PropertyRange available_range = null;

  public PropertyError ()
  {
  } // ctor

  public PropertyError (CosNotification.QoSError_code _code, String _name, CosNotification.PropertyRange _available_range)
  {
    code = _code;
    name = _name;
    available_range = _available_range;
  } // ctor

} // class PropertyError
