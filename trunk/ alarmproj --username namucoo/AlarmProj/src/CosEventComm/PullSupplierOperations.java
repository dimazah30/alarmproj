package CosEventComm;


/**
* CosEventComm/PullSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��8��26�� ������ ����10ʱ45��55�� CST
*/

public interface PullSupplierOperations 
{
  org.omg.CORBA.Any pull () throws CosEventComm.Disconnected;
  org.omg.CORBA.Any try_pull (org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected;
  void disconnect_pull_supplier ();
} // interface PullSupplierOperations
