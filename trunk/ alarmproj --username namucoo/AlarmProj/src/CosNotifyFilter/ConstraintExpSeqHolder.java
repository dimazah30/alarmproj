package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintExpSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class ConstraintExpSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.ConstraintExp value[] = null;

  public ConstraintExpSeqHolder ()
  {
  }

  public ConstraintExpSeqHolder (CosNotifyFilter.ConstraintExp[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.ConstraintExpSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.ConstraintExpSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.ConstraintExpSeqHelper.type ();
  }

}
