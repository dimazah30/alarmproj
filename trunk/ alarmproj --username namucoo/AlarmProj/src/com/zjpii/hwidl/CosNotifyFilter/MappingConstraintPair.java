package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintPair.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
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
