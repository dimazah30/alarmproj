package EPIRPSystem;


/**
* EPIRPSystem/IRPElement.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class IRPElement implements org.omg.CORBA.portable.IDLEntity
{
  public String irpId = null;
  public String irpVersions[] = null;
  public EPIRPSystem.IRPManagementScopeOpt irpManagementScope = null;

  public IRPElement ()
  {
  } // ctor

  public IRPElement (String _irpId, String[] _irpVersions, EPIRPSystem.IRPManagementScopeOpt _irpManagementScope)
  {
    irpId = _irpId;
    irpVersions = _irpVersions;
    irpManagementScope = _irpManagementScope;
  } // ctor

} // class IRPElement
