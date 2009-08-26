package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/UnsignedShortTypeOptHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/

public final class UnsignedShortTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.UnsignedShortTypeOpt value = null;

  public UnsignedShortTypeOptHolder ()
  {
  }

  public UnsignedShortTypeOptHolder (ManagedGenericIRPConstDefs.UnsignedShortTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.UnsignedShortTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.UnsignedShortTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.UnsignedShortTypeOptHelper.type ();
  }

}
