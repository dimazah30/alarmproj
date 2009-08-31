package CosNotifyFilter;


/**
* CosNotifyFilter/CallbackNotFound.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class CallbackNotFound extends org.omg.CORBA.UserException
{

  public CallbackNotFound ()
  {
    super(CallbackNotFoundHelper.id());
  } // ctor


  public CallbackNotFound (String $reason)
  {
    super(CallbackNotFoundHelper.id() + "  " + $reason);
  } // ctor

} // class CallbackNotFound
