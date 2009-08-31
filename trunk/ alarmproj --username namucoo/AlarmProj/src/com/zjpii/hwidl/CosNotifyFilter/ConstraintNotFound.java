package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintNotFound.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class ConstraintNotFound extends org.omg.CORBA.UserException
{
  public int id = (int)0;

  public ConstraintNotFound ()
  {
    super(ConstraintNotFoundHelper.id());
  } // ctor

  public ConstraintNotFound (int _id)
  {
    super(ConstraintNotFoundHelper.id());
    id = _id;
  } // ctor


  public ConstraintNotFound (String $reason, int _id)
  {
    super(ConstraintNotFoundHelper.id() + "  " + $reason);
    id = _id;
  } // ctor

} // class ConstraintNotFound
