package CosNotifyFilter;

/**
* CosNotifyFilter/ConstraintExpHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class ConstraintExpHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.ConstraintExp value = null;

  public ConstraintExpHolder ()
  {
  }

  public ConstraintExpHolder (CosNotifyFilter.ConstraintExp initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.ConstraintExpHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.ConstraintExpHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.ConstraintExpHelper.type ();
  }

}
