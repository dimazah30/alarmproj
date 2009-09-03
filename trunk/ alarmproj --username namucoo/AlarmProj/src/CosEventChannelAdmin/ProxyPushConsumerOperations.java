package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushConsumerOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
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
