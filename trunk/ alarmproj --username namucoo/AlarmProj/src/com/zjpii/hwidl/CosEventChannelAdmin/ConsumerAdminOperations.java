package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ConsumerAdminOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public interface ConsumerAdminOperations 
{
  CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier ();
  CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier ();
} // interface ConsumerAdminOperations
