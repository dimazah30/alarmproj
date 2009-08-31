package ManagedGenericIRPSystem;

/**
* ManagedGenericIRPSystem/OperationNotSupportedHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月25日 星期二 下午04时08分34秒 CST
*/


/*
   Exception thrown when an unsupported optional method is called.
   */
public final class OperationNotSupportedHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPSystem.OperationNotSupported value = null;

  public OperationNotSupportedHolder ()
  {
  }

  public OperationNotSupportedHolder (ManagedGenericIRPSystem.OperationNotSupported initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPSystem.OperationNotSupportedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPSystem.OperationNotSupportedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPSystem.OperationNotSupportedHelper.type ();
  }

}
