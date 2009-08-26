package CosNotifyFilter;


/**
* CosNotifyFilter/DuplicateConstraintID.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
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
