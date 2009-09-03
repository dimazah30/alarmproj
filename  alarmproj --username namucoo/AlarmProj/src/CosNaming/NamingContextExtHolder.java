package CosNaming;

/**
* CosNaming/NamingContextExtHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The NamingContextExt Interface provides the extensions to the 
 * NamingContext Interface as proposed by the Interoperable
 * Naming Service Extension.
 */
public final class NamingContextExtHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContextExt value = null;

  public NamingContextExtHolder ()
  {
  }

  public NamingContextExtHolder (CosNaming.NamingContextExt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextExtHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextExtHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextExtHelper.type ();
  }

}
