package CosNotification;

/**
* CosNotification/UnsupportedQoSHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class UnsupportedQoSHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.UnsupportedQoS value = null;

  public UnsupportedQoSHolder ()
  {
  }

  public UnsupportedQoSHolder (CosNotification.UnsupportedQoS initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.UnsupportedQoSHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.UnsupportedQoSHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.UnsupportedQoSHelper.type ();
  }

}
