package CosNotifyFilter;


/**
* CosNotifyFilter/InvalidValue.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class InvalidValue extends org.omg.CORBA.UserException
{
  public CosNotifyFilter.ConstraintExp constr = null;
  public org.omg.CORBA.Any value = null;

  public InvalidValue ()
  {
    super(InvalidValueHelper.id());
  } // ctor

  public InvalidValue (CosNotifyFilter.ConstraintExp _constr, org.omg.CORBA.Any _value)
  {
    super(InvalidValueHelper.id());
    constr = _constr;
    value = _value;
  } // ctor


  public InvalidValue (String $reason, CosNotifyFilter.ConstraintExp _constr, org.omg.CORBA.Any _value)
  {
    super(InvalidValueHelper.id() + "  " + $reason);
    constr = _constr;
    value = _value;
  } // ctor

} // class InvalidValue
