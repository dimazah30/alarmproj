package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushSupplierOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy push supplier.
    */
public interface ProxyPushSupplierOperations  extends CosEventComm.PushSupplierOperations
{

  /**
         * Connect a push consumer to this proxy.
         * @parm <code>push_consumer</code> - The <code>PushConsumer</code>
         * object reference.
         * @raises AlreadyConnected If this consumer is already connected.
         * @raises TypeError Illegal consumer type.
         */
  void connect_push_consumer (CosEventComm.PushConsumer push_consumer) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError;
} // interface ProxyPushSupplierOperations
