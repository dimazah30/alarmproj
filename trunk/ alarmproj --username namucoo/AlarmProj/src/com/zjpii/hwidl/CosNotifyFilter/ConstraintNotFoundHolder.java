package CosNotifyFilter;

/**
* CosNotifyFilter/ConstraintNotFoundHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class ConstraintNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.ConstraintNotFound value = null;

  public ConstraintNotFoundHolder ()
  {
  }

  public ConstraintNotFoundHolder (CosNotifyFilter.ConstraintNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.ConstraintNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.ConstraintNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.ConstraintNotFoundHelper.type ();
  }

}
