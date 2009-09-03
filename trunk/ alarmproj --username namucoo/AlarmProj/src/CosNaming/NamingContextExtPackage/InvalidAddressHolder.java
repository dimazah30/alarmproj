package CosNaming.NamingContextExtPackage;

/**
* CosNaming/NamingContextExtPackage/InvalidAddressHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

public final class InvalidAddressHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContextExtPackage.InvalidAddress value = null;

  public InvalidAddressHolder ()
  {
  }

  public InvalidAddressHolder (CosNaming.NamingContextExtPackage.InvalidAddress initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextExtPackage.InvalidAddressHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextExtPackage.InvalidAddressHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextExtPackage.InvalidAddressHelper.type ();
  }

}
