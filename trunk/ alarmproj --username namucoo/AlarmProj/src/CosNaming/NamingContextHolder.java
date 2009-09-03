package CosNaming;

/**
* CosNaming/NamingContextHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The NamingContext interface provides operations which support the following:
 * <ul>
 * <li> binding objects
 * <li> name resolution
 * <li> unbinding
 * <li> creating naming contexts
 * <li> deleting contexts
 * <li> listing a naming context
 * </ul>
 */
public final class NamingContextHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContext value = null;

  public NamingContextHolder ()
  {
  }

  public NamingContextHolder (CosNaming.NamingContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextHelper.type ();
  }

}
