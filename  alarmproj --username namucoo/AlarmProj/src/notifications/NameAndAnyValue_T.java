package notifications;


/**
* notifications/NameAndAnyValue_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/

public final class NameAndAnyValue_T implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public org.omg.CORBA.Any value = null;

  public NameAndAnyValue_T ()
  {
  } // ctor

  public NameAndAnyValue_T (String _name, org.omg.CORBA.Any _value)
  {
    name = _name;
    value = _value;
  } // ctor

} // class NameAndAnyValue_T
