package callSNC;


/**
* callSNC/CallAndTopLevelConnections_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
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
