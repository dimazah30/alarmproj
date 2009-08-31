package ManagedGenericIRPSystem;

/**
* ManagedGenericIRPSystem/ValueNotSupportedHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分17秒 CST
*/


/*
   Exception thrown when a valid but unsupported parameter value is passed.
   The parameter shall be the actual parameter name.
   */
public final class ValueNotSupportedHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPSystem.ValueNotSupported value = null;

  public ValueNotSupportedHolder ()
  {
  }

  public ValueNotSupportedHolder (ManagedGenericIRPSystem.ValueNotSupported initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPSystem.ValueNotSupportedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPSystem.ValueNotSupportedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPSystem.ValueNotSupportedHelper.type ();
  }

}
