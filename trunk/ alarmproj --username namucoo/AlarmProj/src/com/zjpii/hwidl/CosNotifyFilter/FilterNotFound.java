package CosNotifyFilter;


/**
* CosNotifyFilter/FilterNotFound.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class FilterNotFound extends org.omg.CORBA.UserException
{

  public FilterNotFound ()
  {
    super(FilterNotFoundHelper.id());
  } // ctor


  public FilterNotFound (String $reason)
  {
    super(FilterNotFoundHelper.id() + "  " + $reason);
  } // ctor

} // class FilterNotFound
