package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintInfoSeqHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class MappingConstraintInfoSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.MappingConstraintInfo value[] = null;

  public MappingConstraintInfoSeqHolder ()
  {
  }

  public MappingConstraintInfoSeqHolder (CosNotifyFilter.MappingConstraintInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.MappingConstraintInfoSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.MappingConstraintInfoSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.MappingConstraintInfoSeqHelper.type ();
  }

}
