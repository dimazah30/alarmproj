package CosEventComm;


/**
* CosEventComm/PushConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��9��2�� ������ ����02ʱ45��10�� CST
*/


/**
    * Interface for a push consumer.
    */
public interface PushConsumerOperations 
{

  /**
       * Push an event onto this consumer.
       * @parm <code>data</code> - The event data.
       * @raises Disconnected If this consumer is disconnected.
       */
  void push (org.omg.CORBA.Any data) throws CosEventComm.Disconnected;

  /**
       * Disconnect a push consumer.
       */
  void disconnect_push_consumer ();
} // interface PushConsumerOperations
