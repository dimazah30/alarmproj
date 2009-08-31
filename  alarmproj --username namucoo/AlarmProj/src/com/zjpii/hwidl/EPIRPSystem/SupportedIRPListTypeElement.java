package EPIRPSystem;


/**
* EPIRPSystem/SupportedIRPListTypeElement.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class SupportedIRPListTypeElement implements org.omg.CORBA.portable.IDLEntity
{
  public String systemDN = null;
  public EPIRPSystem.IRPElement irpList[] = null;

  public SupportedIRPListTypeElement ()
  {
  } // ctor

  public SupportedIRPListTypeElement (String _systemDN, EPIRPSystem.IRPElement[] _irpList)
  {
    systemDN = _systemDN;
    irpList = _irpList;
  } // ctor

} // class SupportedIRPListTypeElement
