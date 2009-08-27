package CosNotifyComm;


/**
* CosNotifyComm/SequencePushSupplierPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// SequencePullSupplier
public abstract class SequencePushSupplierPOA extends org.omg.PortableServer.Servant
 implements CosNotifyComm.SequencePushSupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("disconnect_sequence_push_supplier", new java.lang.Integer (0));
    _methods.put ("subscription_change", new java.lang.Integer (1));
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
       case 0:  // CosNotifyComm/SequencePushSupplier/disconnect_sequence_push_supplier
       {
         this.disconnect_sequence_push_supplier ();
         out = $rh.createReply();
         break;
       }

       case 1:  // CosNotifyComm/NotifySubscribe/subscription_change
       {
         try {
           CosNotification.EventType added[] = CosNotification.EventTypeSeqHelper.read (in);
           CosNotification.EventType removed[] = CosNotification.EventTypeSeqHelper.read (in);
           this.subscription_change (added, removed);
           out = $rh.createReply();
         } catch (CosNotifyComm.InvalidEventType $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyComm.InvalidEventTypeHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyComm/SequencePushSupplier:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SequencePushSupplier _this() 
  {
    return SequencePushSupplierHelper.narrow(
    super._this_object());
  }

  public SequencePushSupplier _this(org.omg.CORBA.ORB orb) 
  {
    return SequencePushSupplierHelper.narrow(
    super._this_object(orb));
  }


} // class SequencePushSupplierPOA
