package CosNotifyFilter;


/**
* CosNotifyFilter/UnsupportedFilterableData.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class UnsupportedFilterableData extends org.omg.CORBA.UserException
{

  public UnsupportedFilterableData ()
  {
    super(UnsupportedFilterableDataHelper.id());
  } // ctor


  public UnsupportedFilterableData (String $reason)
  {
    super(UnsupportedFilterableDataHelper.id() + "  " + $reason);
  } // ctor

} // class UnsupportedFilterableData
