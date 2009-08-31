package CosNotifyFilter;

/**
* CosNotifyFilter/UnsupportedFilterableDataHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class UnsupportedFilterableDataHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.UnsupportedFilterableData value = null;

  public UnsupportedFilterableDataHolder ()
  {
  }

  public UnsupportedFilterableDataHolder (CosNotifyFilter.UnsupportedFilterableData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.UnsupportedFilterableDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.UnsupportedFilterableDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.UnsupportedFilterableDataHelper.type ();
  }

}
