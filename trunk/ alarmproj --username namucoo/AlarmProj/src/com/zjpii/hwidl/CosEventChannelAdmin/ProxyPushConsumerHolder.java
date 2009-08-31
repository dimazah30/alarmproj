package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/ProxyPushConsumerHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年8月26日 星期三 上午10时45分20秒 CST
*/

public final class ProxyPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.ProxyPushConsumer value = null;

  public ProxyPushConsumerHolder ()
  {
  }

  public ProxyPushConsumerHolder (CosEventChannelAdmin.ProxyPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.ProxyPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.ProxyPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.ProxyPushConsumerHelper.type ();
  }

}
