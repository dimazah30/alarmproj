package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/SignalHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/

public final class SignalHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.Signal value = null;

  public SignalHolder ()
  {
  }

  public SignalHolder (ManagedGenericIRPConstDefs.Signal initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.SignalHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.SignalHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.SignalHelper.type ();
  }

}
