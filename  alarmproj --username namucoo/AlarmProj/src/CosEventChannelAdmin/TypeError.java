package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/TypeError.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/

public final class TypeError extends org.omg.CORBA.UserException
{

  public TypeError ()
  {
    super(TypeErrorHelper.id());
  } // ctor


  public TypeError (String $reason)
  {
    super(TypeErrorHelper.id() + "  " + $reason);
  } // ctor

} // class TypeError
