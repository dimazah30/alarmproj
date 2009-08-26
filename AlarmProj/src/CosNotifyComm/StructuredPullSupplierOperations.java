package CosNotifyComm;


/**
* CosNotifyComm/StructuredPullSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPullConsumer
public interface StructuredPullSupplierOperations  extends CosNotifyComm.NotifySubscribeOperations
{
  CosNotification.StructuredEvent pull_structured_event () throws CosEventComm.Disconnected;
  CosNotification.StructuredEvent try_pull_structured_event (org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected;
  void disconnect_structured_pull_supplier ();
} // interface StructuredPullSupplierOperations
