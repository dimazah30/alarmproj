package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintInfo.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class MappingConstraintInfo implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotifyFilter.ConstraintExp constraint_expression = null;
  public int constraint_id = (int)0;
  public org.omg.CORBA.Any value = null;

  public MappingConstraintInfo ()
  {
  } // ctor

  public MappingConstraintInfo (CosNotifyFilter.ConstraintExp _constraint_expression, int _constraint_id, org.omg.CORBA.Any _value)
  {
    constraint_expression = _constraint_expression;
    constraint_id = _constraint_id;
    value = _value;
  } // ctor

} // class MappingConstraintInfo
