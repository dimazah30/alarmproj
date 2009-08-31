package CosNotifyFilter;


/**
* CosNotifyFilter/InvalidGrammar.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public final class InvalidGrammar extends org.omg.CORBA.UserException
{

  public InvalidGrammar ()
  {
    super(InvalidGrammarHelper.id());
  } // ctor


  public InvalidGrammar (String $reason)
  {
    super(InvalidGrammarHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidGrammar
