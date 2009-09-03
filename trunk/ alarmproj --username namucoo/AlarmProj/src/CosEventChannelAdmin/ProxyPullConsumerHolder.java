package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/ProxyPullConsumerHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy pull consumer.
    */
public final class ProxyPullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.ProxyPullConsumer value = null;

  public ProxyPullConsumerHolder ()
  {
  }

  public ProxyPullConsumerHolder (CosEventChannelAdmin.ProxyPullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.ProxyPullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.ProxyPullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.ProxyPullConsumerHelper.type ();
  }

}
