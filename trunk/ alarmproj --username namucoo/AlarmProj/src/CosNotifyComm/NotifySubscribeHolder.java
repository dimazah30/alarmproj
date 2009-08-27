package CosNotifyComm;

/**
* CosNotifyComm/NotifySubscribeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// NotifyPublish
public final class NotifySubscribeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.NotifySubscribe value = null;

  public NotifySubscribeHolder ()
  {
  }

  public NotifySubscribeHolder (CosNotifyComm.NotifySubscribe initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.NotifySubscribeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.NotifySubscribeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.NotifySubscribeHelper.type ();
  }

}
