package CosEventComm;


/**
* CosEventComm/PushConsumerOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年9月2日 星期三 下午02时45分10秒 CST
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
