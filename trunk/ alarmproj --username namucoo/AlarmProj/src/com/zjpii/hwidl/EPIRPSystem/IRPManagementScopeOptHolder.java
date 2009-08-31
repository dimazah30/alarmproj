package EPIRPSystem;

/**
* EPIRPSystem/IRPManagementScopeOptHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class IRPManagementScopeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.IRPManagementScopeOpt value = null;

  public IRPManagementScopeOptHolder ()
  {
  }

  public IRPManagementScopeOptHolder (EPIRPSystem.IRPManagementScopeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.IRPManagementScopeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.IRPManagementScopeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.IRPManagementScopeOptHelper.type ();
  }

}
