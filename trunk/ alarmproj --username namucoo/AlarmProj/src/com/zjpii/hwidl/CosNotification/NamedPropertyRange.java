package CosNotification;


/**
* CosNotification/NamedPropertyRange.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class NamedPropertyRange implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public CosNotification.PropertyRange range = null;

  public NamedPropertyRange ()
  {
  } // ctor

  public NamedPropertyRange (String _name, CosNotification.PropertyRange _range)
  {
    name = _name;
    range = _range;
  } // ctor

} // class NamedPropertyRange
