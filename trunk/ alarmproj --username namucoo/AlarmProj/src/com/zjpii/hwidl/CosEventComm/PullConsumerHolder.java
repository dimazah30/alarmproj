package CosEventComm;

/**
* CosEventComm/PullConsumerHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年8月26日 星期三 上午10时45分55秒 CST
*/

public final class PullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventComm.PullConsumer value = null;

  public PullConsumerHolder ()
  {
  }

  public PullConsumerHolder (CosEventComm.PullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventComm.PullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventComm.PullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventComm.PullConsumerHelper.type ();
  }

}
