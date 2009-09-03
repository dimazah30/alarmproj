package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/EventChannelOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
*/


/**
    * Interface for the event channel.
    */
public interface EventChannelOperations 
{

  /**
         * Gets an object reference to the administration object
         * for event consumers.
         * @returns The <code>ConsumerAdmin</code> object reference.
         */
  CosEventChannelAdmin.ConsumerAdmin for_consumers ();

  /**
         * Gets an object reference to the administration object
         * for event suppliers.
         * @returns The <code>SupplierAdmin</code> object reference.
         */
  CosEventChannelAdmin.SupplierAdmin for_suppliers ();

  /**
         * Destroys this event channel and released any storage used.
         */
  void destroy ();
} // interface EventChannelOperations
