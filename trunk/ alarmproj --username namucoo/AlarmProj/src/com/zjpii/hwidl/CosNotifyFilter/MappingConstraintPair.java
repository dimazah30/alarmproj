package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintPair.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class MappingConstraintPair implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotifyFilter.ConstraintExp constraint_expression = null;
  public org.omg.CORBA.Any result_to_set = null;

  public MappingConstraintPair ()
  {
  } // ctor

  public MappingConstraintPair (CosNotifyFilter.ConstraintExp _constraint_expression, org.omg.CORBA.Any _result_to_set)
  {
    constraint_expression = _constraint_expression;
    result_to_set = _result_to_set;
  } // ctor

} // class MappingConstraintPair
