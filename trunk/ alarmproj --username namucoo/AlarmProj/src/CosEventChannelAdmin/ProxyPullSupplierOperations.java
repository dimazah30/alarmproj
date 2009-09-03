package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
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
