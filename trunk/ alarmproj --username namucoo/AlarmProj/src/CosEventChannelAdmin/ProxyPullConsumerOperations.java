package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
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
