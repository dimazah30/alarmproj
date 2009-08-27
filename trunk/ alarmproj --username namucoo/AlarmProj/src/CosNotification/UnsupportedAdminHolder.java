package CosNotification;

/**
* CosNotification/UnsupportedAdminHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class UnsupportedAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.UnsupportedAdmin value = null;

  public UnsupportedAdminHolder ()
  {
  }

  public UnsupportedAdminHolder (CosNotification.UnsupportedAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.UnsupportedAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.UnsupportedAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.UnsupportedAdminHelper.type ();
  }

}
