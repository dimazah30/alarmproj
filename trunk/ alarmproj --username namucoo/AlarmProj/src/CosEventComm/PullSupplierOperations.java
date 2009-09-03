package CosEventComm;


/**
* CosEventComm/PullSupplierOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年9月2日 星期三 下午02时45分10秒 CST
*/


/**
    * Interface for a pull supplier.
    */
public interface PullSupplierOperations 
{

  /**
       * Pull an event from this supplier
       * @returns The event.
       * @raises Disconnected If this supplier is disconnected.
       */
  org.omg.CORBA.Any pull () throws CosEventComm.Disconnected;

  /**
       * Try to pull an event from this supplier.
       * @parm <code>has_event</code> - boolean indicating if supplier
       * has an event.
       * @returns The event if <code>has_event</code> is true.
       * @raises Disconnected If this supplier is disconnected.
       */
  org.omg.CORBA.Any try_pull (org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected;

  /**
       * Disconnect a pull supplier.
       */
  void disconnect_pull_supplier ();
} // interface PullSupplierOperations
