package CosNotifyFilter;

/**
* CosNotifyFilter/FilterNotFoundHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class FilterNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.FilterNotFound value = null;

  public FilterNotFoundHolder ()
  {
  }

  public FilterNotFoundHolder (CosNotifyFilter.FilterNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.FilterNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.FilterNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.FilterNotFoundHelper.type ();
  }

}
