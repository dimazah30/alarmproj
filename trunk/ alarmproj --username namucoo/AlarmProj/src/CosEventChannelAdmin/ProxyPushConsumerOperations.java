package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushConsumerOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy push consumer.
    */
public interface ProxyPushConsumerOperations  extends CosEventComm.PushConsumerOperations
{

  /**
         * Connect a push supplier to this proxy.
         * @parm <code>push_supplier</code> - The <code>PushSupplier</code>
         * object reference.
         * @raises AlreadyConnected If this supplier is already connected.
         */
  void connect_push_supplier (CosEventComm.PushSupplier push_supplier) throws CosEventChannelAdmin.AlreadyConnected;
} // interface ProxyPushConsumerOperations
