package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public interface ProxyPushConsumerOperations  extends CosEventComm.PushConsumerOperations
{
  void connect_push_supplier (CosEventComm.PushSupplier push_supplier) throws CosEventChannelAdmin.AlreadyConnected;
} // interface ProxyPushConsumerOperations
