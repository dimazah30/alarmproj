package CosNotifyFilter;

/**
* CosNotifyFilter/MappingConstraintInfoHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class MappingConstraintInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.MappingConstraintInfo value = null;

  public MappingConstraintInfoHolder ()
  {
  }

  public MappingConstraintInfoHolder (CosNotifyFilter.MappingConstraintInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.MappingConstraintInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.MappingConstraintInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.MappingConstraintInfoHelper.type ();
  }

}
