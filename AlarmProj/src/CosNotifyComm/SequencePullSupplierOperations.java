package CosNotifyComm;


/**
* CosNotifyComm/SequencePullSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// SequencePullConsumer
public interface SequencePullSupplierOperations  extends CosNotifyComm.NotifySubscribeOperations
{
  CosNotification.StructuredEvent[] pull_structured_events (int max_number) throws CosEventComm.Disconnected;
  CosNotification.StructuredEvent[] try_pull_structured_events (int max_number, org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected;
  void disconnect_sequence_pull_supplier ();
} // interface SequencePullSupplierOperations
