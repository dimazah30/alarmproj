package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/VersionNumberSetHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分25秒 CST
*/

public final class VersionNumberSetHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public VersionNumberSetHolder ()
  {
  }

  public VersionNumberSetHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.VersionNumberSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.VersionNumberSetHelper.type ();
  }

}
