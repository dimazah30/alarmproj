package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public interface ProxyPullSupplierOperations  extends CosEventComm.PullSupplierOperations
{
  void connect_pull_consumer (CosEventComm.PullConsumer pull_consumer) throws CosEventChannelAdmin.AlreadyConnected;
} // interface ProxyPullSupplierOperations
