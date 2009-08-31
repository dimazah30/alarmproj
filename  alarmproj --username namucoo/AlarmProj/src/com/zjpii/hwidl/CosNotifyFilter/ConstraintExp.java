package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintExp.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class ConstraintExp implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.EventType event_types[] = null;
  public String constraint_expr = null;

  public ConstraintExp ()
  {
  } // ctor

  public ConstraintExp (CosNotification.EventType[] _event_types, String _constraint_expr)
  {
    event_types = _event_types;
    constraint_expr = _constraint_expr;
  } // ctor

} // class ConstraintExp
