package CosNotifyFilter;

/**
* CosNotifyFilter/InvalidConstraintHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class InvalidConstraintHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.InvalidConstraint value = null;

  public InvalidConstraintHolder ()
  {
  }

  public InvalidConstraintHolder (CosNotifyFilter.InvalidConstraint initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.InvalidConstraintHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.InvalidConstraintHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.InvalidConstraintHelper.type ();
  }

}
