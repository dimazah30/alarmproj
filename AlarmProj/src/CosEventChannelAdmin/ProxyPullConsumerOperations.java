package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public interface ProxyPullConsumerOperations  extends CosEventComm.PullConsumerOperations
{
  void connect_pull_supplier (CosEventComm.PullSupplier pull_supplier) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError;
} // interface ProxyPullConsumerOperations
