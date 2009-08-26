package CosNotifyFilter;


/**
* CosNotifyFilter/CallbackIDSeqHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class CallbackIDSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public CallbackIDSeqHolder ()
  {
  }

  public CallbackIDSeqHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.CallbackIDSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.CallbackIDSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.CallbackIDSeqHelper.type ();
  }

}
