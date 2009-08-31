package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/StringTypeOptHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分25秒 CST
*/

public final class StringTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.StringTypeOpt value = null;

  public StringTypeOptHolder ()
  {
  }

  public StringTypeOptHolder (ManagedGenericIRPConstDefs.StringTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.StringTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.StringTypeOptHelper.type ();
  }

}
