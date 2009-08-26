package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintExp.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
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
