package CosNotification;


/**
* CosNotification/NamedPropertyRangeSeqHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class NamedPropertyRangeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.NamedPropertyRange value[] = null;

  public NamedPropertyRangeSeqHolder ()
  {
  }

  public NamedPropertyRangeSeqHolder (CosNotification.NamedPropertyRange[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.NamedPropertyRangeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.NamedPropertyRangeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.NamedPropertyRangeSeqHelper.type ();
  }

}
