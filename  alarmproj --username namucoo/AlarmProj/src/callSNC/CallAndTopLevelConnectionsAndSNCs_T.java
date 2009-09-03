package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCs_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class CallAndTopLevelConnectionsAndSNCs_T implements org.omg.CORBA.portable.IDLEntity
{
  public callSNC.Call_T theCall = null;
  public callSNC.ConnectionAndSupportingSNCs_T topLevelConnectionsAndSNCsList[] = null;

  public CallAndTopLevelConnectionsAndSNCs_T ()
  {
  } // ctor

  public CallAndTopLevelConnectionsAndSNCs_T (callSNC.Call_T _theCall, callSNC.ConnectionAndSupportingSNCs_T[] _topLevelConnectionsAndSNCsList)
  {
    theCall = _theCall;
    topLevelConnectionsAndSNCsList = _topLevelConnectionsAndSNCsList;
  } // ctor

} // class CallAndTopLevelConnectionsAndSNCs_T
