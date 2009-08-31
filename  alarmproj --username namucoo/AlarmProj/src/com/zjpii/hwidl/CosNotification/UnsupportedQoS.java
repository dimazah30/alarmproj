package CosNotification;


/**
* CosNotification/UnsupportedQoS.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class UnsupportedQoS extends org.omg.CORBA.UserException
{
  public CosNotification.PropertyError qos_err[] = null;

  public UnsupportedQoS ()
  {
    super(UnsupportedQoSHelper.id());
  } // ctor

  public UnsupportedQoS (CosNotification.PropertyError[] _qos_err)
  {
    super(UnsupportedQoSHelper.id());
    qos_err = _qos_err;
  } // ctor


  public UnsupportedQoS (String $reason, CosNotification.PropertyError[] _qos_err)
  {
    super(UnsupportedQoSHelper.id() + "  " + $reason);
    qos_err = _qos_err;
  } // ctor

} // class UnsupportedQoS
