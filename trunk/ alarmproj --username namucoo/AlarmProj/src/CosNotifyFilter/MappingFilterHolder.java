package CosNotifyFilter;

/**
* CosNotifyFilter/MappingFilterHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/


// Filter
public final class MappingFilterHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.MappingFilter value = null;

  public MappingFilterHolder ()
  {
  }

  public MappingFilterHolder (CosNotifyFilter.MappingFilter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.MappingFilterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.MappingFilterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.MappingFilterHelper.type ();
  }

}
