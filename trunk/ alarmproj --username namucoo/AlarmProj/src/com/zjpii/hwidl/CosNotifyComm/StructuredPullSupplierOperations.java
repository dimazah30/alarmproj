package CosNotifyComm;


/**
* CosNotifyComm/StructuredPullSupplierOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// StructuredPullConsumer
public interface StructuredPullSupplierOperations  extends CosNotifyComm.NotifySubscribeOperations
{
  CosNotification.StructuredEvent pull_structured_event () throws CosEventComm.Disconnected;
  CosNotification.StructuredEvent try_pull_structured_event (org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected;
  void disconnect_structured_pull_supplier ();
} // interface StructuredPullSupplierOperations
