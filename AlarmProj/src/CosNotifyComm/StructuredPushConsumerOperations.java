package CosNotifyComm;


/**
* CosNotifyComm/StructuredPushConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/

public interface StructuredPushConsumerOperations  extends CosNotifyComm.NotifyPublishOperations
{
  void push_structured_event (CosNotification.StructuredEvent notification) throws CosEventComm.Disconnected;
  void disconnect_structured_push_consumer ();
} // interface StructuredPushConsumerOperations
