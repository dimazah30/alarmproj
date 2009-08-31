package CosNotifyFilter;

/**
* CosNotifyFilter/ConstraintInfoHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class ConstraintInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.ConstraintInfo value = null;

  public ConstraintInfoHolder ()
  {
  }

  public ConstraintInfoHolder (CosNotifyFilter.ConstraintInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.ConstraintInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.ConstraintInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.ConstraintInfoHelper.type ();
  }

}
