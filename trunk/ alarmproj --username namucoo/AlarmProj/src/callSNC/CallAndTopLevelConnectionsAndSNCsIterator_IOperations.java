package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCsIterator_IOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public interface CallAndTopLevelConnectionsAndSNCsIterator_IOperations 
{
  boolean next_n (int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface CallAndTopLevelConnectionsAndSNCsIterator_IOperations
