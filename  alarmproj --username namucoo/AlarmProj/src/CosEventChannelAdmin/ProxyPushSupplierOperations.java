package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushSupplierOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年8月26日 星期三 上午10时45分20秒 CST
*/

public interface ProxyPushSupplierOperations  extends CosEventComm.PushSupplierOperations
{
  void connect_push_consumer (CosEventComm.PushConsumer push_consumer) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError;
} // interface ProxyPushSupplierOperations
