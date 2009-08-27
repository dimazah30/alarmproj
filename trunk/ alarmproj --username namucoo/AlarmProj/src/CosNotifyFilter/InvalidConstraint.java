package CosNotifyFilter;


/**
* CosNotifyFilter/InvalidConstraint.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
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
