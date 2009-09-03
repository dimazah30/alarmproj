package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/SupplierAdminOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
*/


/**
    * Interface for the supplier administration object.
    */
public interface SupplierAdminOperations 
{

  /**
         * Obtain a push consumer proxy for this administration object.
         * @returns A <code>ProxyPushConsumer</code> object reference.
         */
  CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer ();

  /**
         * Obtain a pull consumer proxy for this administration object.
         * @returns A <code>ProxyPullConsumer</code> object reference.
         */
  CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer ();
} // interface SupplierAdminOperations
