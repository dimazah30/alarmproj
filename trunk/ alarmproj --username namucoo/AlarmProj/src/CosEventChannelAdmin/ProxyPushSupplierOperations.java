package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public interface ProxyPushSupplierOperations  extends CosEventComm.PushSupplierOperations
{
  void connect_push_consumer (CosEventComm.PushConsumer push_consumer) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError;
} // interface ProxyPushSupplierOperations
