package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/Method.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/

public final class Method implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String parameter_list[] = null;

  public Method ()
  {
  } // ctor

  public Method (String _name, String[] _parameter_list)
  {
    name = _name;
    parameter_list = _parameter_list;
  } // ctor

} // class Method
