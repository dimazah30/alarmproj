package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/EventChannelOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public interface EventChannelOperations 
{
  CosEventChannelAdmin.ConsumerAdmin for_consumers ();
  CosEventChannelAdmin.SupplierAdmin for_suppliers ();
  void destroy ();
} // interface EventChannelOperations
