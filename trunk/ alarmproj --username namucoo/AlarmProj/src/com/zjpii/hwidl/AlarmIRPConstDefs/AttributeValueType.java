package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeValueType.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AttributeValueType implements org.omg.CORBA.portable.IDLEntity
{
  public String attribute_name = null;
  public org.omg.CORBA.Any value = null;

  public AttributeValueType ()
  {
  } // ctor

  public AttributeValueType (String _attribute_name, org.omg.CORBA.Any _value)
  {
    attribute_name = _attribute_name;
    value = _value;
  } // ctor

} // class AttributeValueType
