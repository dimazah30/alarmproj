package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeValueChangeType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
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
