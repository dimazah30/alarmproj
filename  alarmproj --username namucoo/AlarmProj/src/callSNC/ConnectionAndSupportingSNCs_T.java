package callSNC;


/**
* callSNC/ConnectionAndSupportingSNCs_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class ConnectionAndSupportingSNCs_T implements org.omg.CORBA.portable.IDLEntity
{
  public subnetworkConnection.SubnetworkConnection_T topLevelConnection = null;
  public subnetworkConnection.SubnetworkConnection_T sNCList[] = null;

  public ConnectionAndSupportingSNCs_T ()
  {
  } // ctor

  public ConnectionAndSupportingSNCs_T (subnetworkConnection.SubnetworkConnection_T _topLevelConnection, subnetworkConnection.SubnetworkConnection_T[] _sNCList)
  {
    topLevelConnection = _topLevelConnection;
    sNCList = _sNCList;
  } // ctor

} // class ConnectionAndSupportingSNCs_T
