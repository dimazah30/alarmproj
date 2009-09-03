package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ConsumerAdminOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
*/


/**
    * Interface for the consumer administration object.
    */
public interface ConsumerAdminOperations 
{

  /**
         * Obtain a push supplier proxy for this administration object.
         * @returns A <code>ProxyPushSupplier</code> object reference.
         */
  CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier ();

  /**
         * Obtain a pull supplier proxy for this administration object.
         * @returns A <code>ProxyPullSupplier</code> object reference.
         */
  CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier ();
} // interface ConsumerAdminOperations
