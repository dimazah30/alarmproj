package CosNotifyComm;


/**
* CosNotifyComm/StructuredPushConsumerOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/

public interface StructuredPushConsumerOperations  extends CosNotifyComm.NotifyPublishOperations
{
  void push_structured_event (CosNotification.StructuredEvent notification) throws CosEventComm.Disconnected;
  void disconnect_structured_push_consumer ();
} // interface StructuredPushConsumerOperations
