package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintInfo.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
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
