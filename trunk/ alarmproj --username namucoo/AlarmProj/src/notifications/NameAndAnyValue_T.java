package notifications;


/**
* notifications/NameAndAnyValue_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/

public final class NameAndAnyValue_T implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public org.omg.CORBA.Any value = null;

  public NameAndAnyValue_T ()
  {
  } // ctor

  public NameAndAnyValue_T (String _name, org.omg.CORBA.Any _value)
  {
    name = _name;
    value = _value;
  } // ctor

} // class NameAndAnyValue_T
