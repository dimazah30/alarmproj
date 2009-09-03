package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
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
