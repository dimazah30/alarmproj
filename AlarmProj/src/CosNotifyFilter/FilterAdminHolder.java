package CosNotifyFilter;

/**
* CosNotifyFilter/FilterAdminHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class FilterAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.FilterAdmin value = null;

  public FilterAdminHolder ()
  {
  }

  public FilterAdminHolder (CosNotifyFilter.FilterAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.FilterAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.FilterAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.FilterAdminHelper.type ();
  }

}
