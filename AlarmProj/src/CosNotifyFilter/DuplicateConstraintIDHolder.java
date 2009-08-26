package CosNotifyFilter;

/**
* CosNotifyFilter/DuplicateConstraintIDHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class DuplicateConstraintIDHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.DuplicateConstraintID value = null;

  public DuplicateConstraintIDHolder ()
  {
  }

  public DuplicateConstraintIDHolder (CosNotifyFilter.DuplicateConstraintID initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.DuplicateConstraintIDHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.DuplicateConstraintIDHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.DuplicateConstraintIDHelper.type ();
  }

}
