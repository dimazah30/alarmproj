package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/SupplierAdminOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
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
