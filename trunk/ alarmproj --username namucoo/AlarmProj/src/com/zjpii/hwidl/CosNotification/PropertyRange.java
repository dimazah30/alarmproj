package CosNotification;


/**
* CosNotification/PropertyRange.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class PropertyRange implements org.omg.CORBA.portable.IDLEntity
{
  public org.omg.CORBA.Any low_val = null;
  public org.omg.CORBA.Any high_val = null;

  public PropertyRange ()
  {
  } // ctor

  public PropertyRange (org.omg.CORBA.Any _low_val, org.omg.CORBA.Any _high_val)
  {
    low_val = _low_val;
    high_val = _high_val;
  } // ctor

} // class PropertyRange
