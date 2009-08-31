package CosNotification;


/**
* CosNotification/UnsupportedAdmin.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class UnsupportedAdmin extends org.omg.CORBA.UserException
{
  public CosNotification.PropertyError admin_err[] = null;

  public UnsupportedAdmin ()
  {
    super(UnsupportedAdminHelper.id());
  } // ctor

  public UnsupportedAdmin (CosNotification.PropertyError[] _admin_err)
  {
    super(UnsupportedAdminHelper.id());
    admin_err = _admin_err;
  } // ctor


  public UnsupportedAdmin (String $reason, CosNotification.PropertyError[] _admin_err)
  {
    super(UnsupportedAdminHelper.id() + "  " + $reason);
    admin_err = _admin_err;
  } // ctor

} // class UnsupportedAdmin
