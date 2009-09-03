package CosNaming.NamingContextPackage;

/**
* CosNaming/NamingContextPackage/AlreadyBoundHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

public final class AlreadyBoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContextPackage.AlreadyBound value = null;

  public AlreadyBoundHolder ()
  {
  }

  public AlreadyBoundHolder (CosNaming.NamingContextPackage.AlreadyBound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextPackage.AlreadyBoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextPackage.AlreadyBoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextPackage.AlreadyBoundHelper.type ();
  }

}
