package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/ParameterListHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/

public final class ParameterListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ParameterListHolder ()
  {
  }

  public ParameterListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.ParameterListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.ParameterListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.ParameterListHelper.type ();
  }

}
