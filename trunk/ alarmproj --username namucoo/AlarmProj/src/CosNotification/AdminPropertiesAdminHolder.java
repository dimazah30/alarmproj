package CosNotification;

/**
* CosNotification/AdminPropertiesAdminHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/


// MaxSuppliers takes on a value of type long
public final class AdminPropertiesAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.AdminPropertiesAdmin value = null;

  public AdminPropertiesAdminHolder ()
  {
  }

  public AdminPropertiesAdminHolder (CosNotification.AdminPropertiesAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.AdminPropertiesAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.AdminPropertiesAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.AdminPropertiesAdminHelper.type ();
  }

}
