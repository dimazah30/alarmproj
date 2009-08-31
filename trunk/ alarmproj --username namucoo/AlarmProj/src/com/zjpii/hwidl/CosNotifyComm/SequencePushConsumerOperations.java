package CosNotifyComm;


/**
* CosNotifyComm/SequencePushConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPushSupplier
public interface SequencePushConsumerOperations  extends CosNotifyComm.NotifyPublishOperations
{
  void push_structured_events (CosNotification.StructuredEvent[] notifications) throws CosEventComm.Disconnected;
  void disconnect_sequence_push_consumer ();
} // interface SequencePushConsumerOperations
