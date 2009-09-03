package CosEventComm;

/**
* CosEventComm/PushConsumerHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年9月2日 星期三 下午02时45分10秒 CST
*/


/**
    * Interface for a push consumer.
    */
public final class PushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventComm.PushConsumer value = null;

  public PushConsumerHolder ()
  {
  }

  public PushConsumerHolder (CosEventComm.PushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventComm.PushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventComm.PushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventComm.PushConsumerHelper.type ();
  }

}
