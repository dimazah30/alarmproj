package CosNotifyFilter;

/**
* CosNotifyFilter/InvalidConstraintHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
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
