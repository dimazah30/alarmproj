package CosNotifyFilter;


/**
* CosNotifyFilter/InvalidValue.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
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
