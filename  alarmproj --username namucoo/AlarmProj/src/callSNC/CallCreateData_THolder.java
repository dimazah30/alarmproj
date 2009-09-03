package callSNC;

/**
* callSNC/CallCreateData_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class CallCreateData_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallCreateData_T value = null;

  public CallCreateData_THolder ()
  {
  }

  public CallCreateData_THolder (callSNC.CallCreateData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallCreateData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallCreateData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallCreateData_THelper.type ();
  }

}
