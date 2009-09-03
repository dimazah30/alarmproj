package callSNC;


/**
* callSNC/CallEnd_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class CallEnd_T implements org.omg.CORBA.portable.IDLEntity
{
  public String tNANameOrGroupTNAName = null;
  public String sNPPid = null;
  public String sNPid = null;
  public globaldefs.NameAndStringValue_T tpName[] = null;

  public CallEnd_T ()
  {
  } // ctor

  public CallEnd_T (String _tNANameOrGroupTNAName, String _sNPPid, String _sNPid, globaldefs.NameAndStringValue_T[] _tpName)
  {
    tNANameOrGroupTNAName = _tNANameOrGroupTNAName;
    sNPPid = _sNPPid;
    sNPid = _sNPid;
    tpName = _tpName;
  } // ctor

} // class CallEnd_T
