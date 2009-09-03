package callSNC;


/**
* callSNC/CallAndTopLevelConnections_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class CallAndTopLevelConnections_T implements org.omg.CORBA.portable.IDLEntity
{
  public callSNC.Call_T theCall = null;
  public subnetworkConnection.SubnetworkConnection_T topLevelConnectionsList[] = null;

  public CallAndTopLevelConnections_T ()
  {
  } // ctor

  public CallAndTopLevelConnections_T (callSNC.Call_T _theCall, subnetworkConnection.SubnetworkConnection_T[] _topLevelConnectionsList)
  {
    theCall = _theCall;
    topLevelConnectionsList = _topLevelConnectionsList;
  } // ctor

} // class CallAndTopLevelConnections_T
