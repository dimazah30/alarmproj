package EPIRPSystem;

/**
* EPIRPSystem/IRPElementHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class IRPElementHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.IRPElement value = null;

  public IRPElementHolder ()
  {
  }

  public IRPElementHolder (EPIRPSystem.IRPElement initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.IRPElementHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.IRPElementHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.IRPElementHelper.type ();
  }

}
