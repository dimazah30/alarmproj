package CosEventComm;


/**
* CosEventComm/PushConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��8��26�� ������ ����10ʱ45��55�� CST
*/

public interface PushConsumerOperations 
{
  void push (org.omg.CORBA.Any data) throws CosEventComm.Disconnected;
  void disconnect_push_consumer ();
} // interface PushConsumerOperations
