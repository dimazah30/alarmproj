package CosNotifyComm;


/**
* CosNotifyComm/SequencePushConsumerOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// StructuredPushSupplier
public interface SequencePushConsumerOperations  extends CosNotifyComm.NotifyPublishOperations
{
  void push_structured_events (CosNotification.StructuredEvent[] notifications) throws CosEventComm.Disconnected;
  void disconnect_sequence_push_consumer ();
} // interface SequencePushConsumerOperations
