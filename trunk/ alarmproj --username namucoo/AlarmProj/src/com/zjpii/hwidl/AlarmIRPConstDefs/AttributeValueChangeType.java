package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeValueChangeType.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AttributeValueChangeType implements org.omg.CORBA.portable.IDLEntity
{
  public String attribute_name = null;
  public org.omg.CORBA.Any old_value = null;

  // type depends on attribute
  public org.omg.CORBA.Any new_value = null;

  public AttributeValueChangeType ()
  {
  } // ctor

  public AttributeValueChangeType (String _attribute_name, org.omg.CORBA.Any _old_value, org.omg.CORBA.Any _new_value)
  {
    attribute_name = _attribute_name;
    old_value = _old_value;
    new_value = _new_value;
  } // ctor

} // class AttributeValueChangeType
