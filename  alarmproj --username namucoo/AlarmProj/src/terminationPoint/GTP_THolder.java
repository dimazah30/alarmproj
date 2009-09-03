package terminationPoint;

/**
* terminationPoint/GTP_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/

public final class GTP_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.GTP_T value = null;

  public GTP_THolder ()
  {
  }

  public GTP_THolder (terminationPoint.GTP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.GTP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.GTP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.GTP_THelper.type ();
  }

}
