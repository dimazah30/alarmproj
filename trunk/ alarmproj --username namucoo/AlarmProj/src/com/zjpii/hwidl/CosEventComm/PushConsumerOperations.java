package CosEventComm;


/**
* CosEventComm/PushConsumerOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年8月26日 星期三 上午10时45分55秒 CST
*/

public interface PushConsumerOperations 
{
  void push (org.omg.CORBA.Any data) throws CosEventComm.Disconnected;
  void disconnect_push_consumer ();
} // interface PushConsumerOperations
