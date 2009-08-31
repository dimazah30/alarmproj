package CosNotifyFilter;

/**
* CosNotifyFilter/FilterHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class FilterHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.Filter value = null;

  public FilterHolder ()
  {
  }

  public FilterHolder (CosNotifyFilter.Filter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.FilterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.FilterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.FilterHelper.type ();
  }

}
