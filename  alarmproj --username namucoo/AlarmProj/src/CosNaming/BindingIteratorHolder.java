package CosNaming;

/**
* CosNaming/BindingIteratorHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The BindingIterator interface allows a client to iterate through the
 * bindings using the next_one or next_n operations.
 */
public final class BindingIteratorHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.BindingIterator value = null;

  public BindingIteratorHolder ()
  {
  }

  public BindingIteratorHolder (CosNaming.BindingIterator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.BindingIteratorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.BindingIteratorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.BindingIteratorHelper.type ();
  }

}
