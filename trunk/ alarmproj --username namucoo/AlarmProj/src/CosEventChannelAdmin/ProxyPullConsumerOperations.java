package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullConsumerOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy pull consumer.
    */
public interface ProxyPullConsumerOperations  extends CosEventComm.PullConsumerOperations
{

  /**
         * Connect a pull supplier to this proxy.
         * @parm <code>pull_supplier</code> - The <code>PullSupplier</code>
         * object reference.
         * @raises AlreadyConnected If this supplier is already connected.
         * @raises TypeError Illegal supplier type.
         */
  void connect_pull_supplier (CosEventComm.PullSupplier pull_supplier) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError;
} // interface ProxyPullConsumerOperations
