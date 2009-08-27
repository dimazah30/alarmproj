package CosNotifyFilter;

/**
* CosNotifyFilter/FilterFactoryHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/


// MappingFilter
public final class FilterFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.FilterFactory value = null;

  public FilterFactoryHolder ()
  {
  }

  public FilterFactoryHolder (CosNotifyFilter.FilterFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.FilterFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.FilterFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.FilterFactoryHelper.type ();
  }

}
