package CosNaming.NamingContextPackage;


/**
* CosNaming/NamingContextPackage/NotFound.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

public final class NotFound extends org.omg.CORBA.UserException
{
  public CosNaming.NamingContextPackage.NotFoundReason why = null;
  public CosNaming.NameComponent rest_of_name[] = null;

  public NotFound ()
  {
    super(NotFoundHelper.id());
  } // ctor

  public NotFound (CosNaming.NamingContextPackage.NotFoundReason _why, CosNaming.NameComponent[] _rest_of_name)
  {
    super(NotFoundHelper.id());
    why = _why;
    rest_of_name = _rest_of_name;
  } // ctor


  public NotFound (String $reason, CosNaming.NamingContextPackage.NotFoundReason _why, CosNaming.NameComponent[] _rest_of_name)
  {
    super(NotFoundHelper.id() + "  " + $reason);
    why = _why;
    rest_of_name = _rest_of_name;
  } // ctor

} // class NotFound
