package CosNotifyFilter;

/**
* CosNotifyFilter/FilterHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class FilterHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.Filter value = null;

  public FilterHolder ()
  {
  }

  public FilterHolder (CosNotifyFilter.Filter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.FilterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.FilterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.FilterHelper.type ();
  }

}
