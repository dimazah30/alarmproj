package CosNotifyFilter;


/**
* CosNotifyFilter/InvalidConstraint.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class InvalidConstraint extends org.omg.CORBA.UserException
{
  public CosNotifyFilter.ConstraintExp constr = null;

  public InvalidConstraint ()
  {
    super(InvalidConstraintHelper.id());
  } // ctor

  public InvalidConstraint (CosNotifyFilter.ConstraintExp _constr)
  {
    super(InvalidConstraintHelper.id());
    constr = _constr;
  } // ctor


  public InvalidConstraint (String $reason, CosNotifyFilter.ConstraintExp _constr)
  {
    super(InvalidConstraintHelper.id() + "  " + $reason);
    constr = _constr;
  } // ctor

} // class InvalidConstraint
