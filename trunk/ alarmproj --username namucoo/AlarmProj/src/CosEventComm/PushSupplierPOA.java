package CosEventComm;


/**
* CosEventComm/PushSupplierPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年9月2日 星期三 下午02时45分10秒 CST
*/


/**
    * Interface for a push supplier.
    */
public abstract class PushSupplierPOA extends org.omg.PortableServer.Servant
 implements CosEventComm.PushSupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("disconnect_push_supplier", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
       * Disconnect a push supplier.
       */
       case 0:  // CosEventComm/PushSupplier/disconnect_push_supplier
       {
         this.disconnect_push_supplier ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventComm/PushSupplier:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PushSupplier _this() 
  {
    return PushSupplierHelper.narrow(
    super._this_object());
  }

  public PushSupplier _this(org.omg.CORBA.ORB orb) 
  {
    return PushSupplierHelper.narrow(
    super._this_object(orb));
  }


} // class PushSupplierPOA
