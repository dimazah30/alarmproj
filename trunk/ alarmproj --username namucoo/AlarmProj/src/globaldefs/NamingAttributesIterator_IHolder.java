package globaldefs;

/**
* globaldefs/NamingAttributesIterator_IHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class NamingAttributesIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NamingAttributesIterator_I value = null;

  public NamingAttributesIterator_IHolder ()
  {
  }

  public NamingAttributesIterator_IHolder (globaldefs.NamingAttributesIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.NamingAttributesIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.NamingAttributesIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.NamingAttributesIterator_IHelper.type ();
  }

}
