package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/EventChannelOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
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
