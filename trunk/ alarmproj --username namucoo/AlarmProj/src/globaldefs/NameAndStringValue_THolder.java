package globaldefs;

/**
* globaldefs/NameAndStringValue_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/

public final class NameAndStringValue_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NameAndStringValue_T value = null;

  public NameAndStringValue_THolder ()
  {
  }

  public NameAndStringValue_THolder (globaldefs.NameAndStringValue_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.NameAndStringValue_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.NameAndStringValue_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.NameAndStringValue_THelper.type ();
  }

}
