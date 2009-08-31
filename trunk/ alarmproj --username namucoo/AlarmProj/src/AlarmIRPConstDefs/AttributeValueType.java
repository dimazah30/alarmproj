package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeValueType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
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
