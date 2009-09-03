package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullSupplierOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy pull supplier.
    */
public interface ProxyPullSupplierOperations  extends CosEventComm.PullSupplierOperations
{

  /**
         * Connect a pull consumer to this proxy.
         * @parm <code>pull_consumer</code> - The <code>PullConsumer</code>
         * object reference.
         * @raises AlreadyConnected If this consumer is already connected.
         */
  void connect_pull_consumer (CosEventComm.PullConsumer pull_consumer) throws CosEventChannelAdmin.AlreadyConnected;
} // interface ProxyPullSupplierOperations
