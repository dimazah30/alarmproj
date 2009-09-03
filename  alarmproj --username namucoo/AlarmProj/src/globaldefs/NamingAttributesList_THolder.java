package globaldefs;


/**
* globaldefs/NamingAttributesList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p>A list of NamingAttributes_T. It is a list of lists.</p>
   **/
public final class NamingAttributesList_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NameAndStringValue_T value[][] = null;

  public NamingAttributesList_THolder ()
  {
  }

  public NamingAttributesList_THolder (globaldefs.NameAndStringValue_T[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.NamingAttributesList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.NamingAttributesList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.NamingAttributesList_THelper.type ();
  }

}
