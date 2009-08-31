package CosNotifyFilter;

/**
* CosNotifyFilter/InvalidValueHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class InvalidValueHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.InvalidValue value = null;

  public InvalidValueHolder ()
  {
  }

  public InvalidValueHolder (CosNotifyFilter.InvalidValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.InvalidValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.InvalidValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.InvalidValueHelper.type ();
  }

}
