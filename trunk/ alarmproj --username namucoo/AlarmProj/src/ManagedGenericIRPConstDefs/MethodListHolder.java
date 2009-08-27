package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/MethodListHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/


/*
   List of all methods and their associated parameters.
   */
public final class MethodListHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.Method value[] = null;

  public MethodListHolder ()
  {
  }

  public MethodListHolder (ManagedGenericIRPConstDefs.Method[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.MethodListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.MethodListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.MethodListHelper.type ();
  }

}
