package callSNC;

/**
* callSNC/CallAndTopLevelConnectionsAndSNCsIterator_IHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class CallAndTopLevelConnectionsAndSNCsIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I value = null;

  public CallAndTopLevelConnectionsAndSNCsIterator_IHolder ()
  {
  }

  public CallAndTopLevelConnectionsAndSNCsIterator_IHolder (callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.type ();
  }

}
