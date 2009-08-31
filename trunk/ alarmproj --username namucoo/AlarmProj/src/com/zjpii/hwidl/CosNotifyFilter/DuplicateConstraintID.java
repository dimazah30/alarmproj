package CosNotifyFilter;


/**
* CosNotifyFilter/DuplicateConstraintID.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class DuplicateConstraintID extends org.omg.CORBA.UserException
{
  public int id = (int)0;

  public DuplicateConstraintID ()
  {
    super(DuplicateConstraintIDHelper.id());
  } // ctor

  public DuplicateConstraintID (int _id)
  {
    super(DuplicateConstraintIDHelper.id());
    id = _id;
  } // ctor


  public DuplicateConstraintID (String $reason, int _id)
  {
    super(DuplicateConstraintIDHelper.id() + "  " + $reason);
    id = _id;
  } // ctor

} // class DuplicateConstraintID
