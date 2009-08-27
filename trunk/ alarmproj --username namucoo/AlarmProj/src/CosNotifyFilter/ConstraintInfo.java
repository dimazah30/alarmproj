package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintInfo.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class ConstraintInfo implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotifyFilter.ConstraintExp constraint_expression = null;
  public int constraint_id = (int)0;

  public ConstraintInfo ()
  {
  } // ctor

  public ConstraintInfo (CosNotifyFilter.ConstraintExp _constraint_expression, int _constraint_id)
  {
    constraint_expression = _constraint_expression;
    constraint_id = _constraint_id;
  } // ctor

} // class ConstraintInfo
