package CosNotifyComm;

/**
* CosNotifyComm/StructuredPushConsumerHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/

public final class StructuredPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPushConsumer value = null;

  public StructuredPushConsumerHolder ()
  {
  }

  public StructuredPushConsumerHolder (CosNotifyComm.StructuredPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPushConsumerHelper.type ();
  }

}
