package CosNotifyFilter;

/**
* CosNotifyFilter/CallbackNotFoundHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class CallbackNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.CallbackNotFound value = null;

  public CallbackNotFoundHolder ()
  {
  }

  public CallbackNotFoundHolder (CosNotifyFilter.CallbackNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.CallbackNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.CallbackNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.CallbackNotFoundHelper.type ();
  }

}
