package CosNotifyFilter;

/**
* CosNotifyFilter/FilterNotFoundHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class FilterNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.FilterNotFound value = null;

  public FilterNotFoundHolder ()
  {
  }

  public FilterNotFoundHolder (CosNotifyFilter.FilterNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.FilterNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.FilterNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.FilterNotFoundHelper.type ();
  }

}
