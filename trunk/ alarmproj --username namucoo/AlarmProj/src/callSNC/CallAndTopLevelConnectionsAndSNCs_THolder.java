package callSNC;

/**
* callSNC/CallAndTopLevelConnectionsAndSNCs_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class CallAndTopLevelConnectionsAndSNCs_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallAndTopLevelConnectionsAndSNCs_T value = null;

  public CallAndTopLevelConnectionsAndSNCs_THolder ()
  {
  }

  public CallAndTopLevelConnectionsAndSNCs_THolder (callSNC.CallAndTopLevelConnectionsAndSNCs_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.type ();
  }

}
