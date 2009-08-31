package CosNotification;

/**
* CosNotification/AdminPropertiesAdminHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
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
