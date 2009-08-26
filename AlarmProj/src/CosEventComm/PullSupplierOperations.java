package CosEventComm;


/**
* CosEventComm/PullSupplierOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年8月26日 星期三 上午10时45分55秒 CST
*/

public interface PullSupplierOperations 
{
  org.omg.CORBA.Any pull () throws CosEventComm.Disconnected;
  org.omg.CORBA.Any try_pull (org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected;
  void disconnect_pull_supplier ();
} // interface PullSupplierOperations
