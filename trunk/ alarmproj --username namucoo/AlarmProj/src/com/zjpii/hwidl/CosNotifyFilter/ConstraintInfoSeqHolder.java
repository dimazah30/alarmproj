package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintInfoSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class ConstraintInfoSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.ConstraintInfo value[] = null;

  public ConstraintInfoSeqHolder ()
  {
  }

  public ConstraintInfoSeqHolder (CosNotifyFilter.ConstraintInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.ConstraintInfoSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.ConstraintInfoSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.ConstraintInfoSeqHelper.type ();
  }

}
