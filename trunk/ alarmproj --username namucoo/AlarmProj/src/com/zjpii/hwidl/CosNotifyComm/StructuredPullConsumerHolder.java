package CosNotifyComm;

/**
* CosNotifyComm/StructuredPullConsumerHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// StructuredPushConsumer
public final class StructuredPullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPullConsumer value = null;

  public StructuredPullConsumerHolder ()
  {
  }

  public StructuredPullConsumerHolder (CosNotifyComm.StructuredPullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPullConsumerHelper.type ();
  }

}
