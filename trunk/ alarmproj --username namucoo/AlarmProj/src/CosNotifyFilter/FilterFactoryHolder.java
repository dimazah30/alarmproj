package CosNotifyFilter;

/**
* CosNotifyFilter/FilterFactoryHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/


// MappingFilter
public final class FilterFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.FilterFactory value = null;

  public FilterFactoryHolder ()
  {
  }

  public FilterFactoryHolder (CosNotifyFilter.FilterFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.FilterFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.FilterFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.FilterFactoryHelper.type ();
  }

}
