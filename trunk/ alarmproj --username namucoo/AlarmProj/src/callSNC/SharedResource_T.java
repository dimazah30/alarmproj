package callSNC;


/**
* callSNC/SharedResource_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class SharedResource_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public globaldefs.NameAndStringValue_T connectionNameList[][] = null;

  public SharedResource_T ()
  {
  } // ctor

  public SharedResource_T (globaldefs.NameAndStringValue_T[] _name, globaldefs.NameAndStringValue_T[][] _connectionNameList)
  {
    name = _name;
    connectionNameList = _connectionNameList;
  } // ctor

} // class SharedResource_T
