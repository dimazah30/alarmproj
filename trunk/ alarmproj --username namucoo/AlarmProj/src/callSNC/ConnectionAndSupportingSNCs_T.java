package callSNC;


/**
* callSNC/ConnectionAndSupportingSNCs_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
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
