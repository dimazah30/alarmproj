package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCs_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
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
