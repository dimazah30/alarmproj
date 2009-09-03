package CosEventComm;


/**
* CosEventComm/PullSupplierOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��9��2�� ������ ����02ʱ45��10�� CST
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
