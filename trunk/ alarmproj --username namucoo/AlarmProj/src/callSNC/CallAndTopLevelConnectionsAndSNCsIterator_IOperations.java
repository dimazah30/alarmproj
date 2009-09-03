package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCsIterator_IOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public interface CallAndTopLevelConnectionsAndSNCsIterator_IOperations 
{
  boolean next_n (int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface CallAndTopLevelConnectionsAndSNCsIterator_IOperations
