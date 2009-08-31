package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushSupplierPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年8月26日 星期三 上午10时45分20秒 CST
*/

public abstract class ProxyPushSupplierPOA extends org.omg.PortableServer.Servant
 implements CosEventChannelAdmin.ProxyPushSupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect_push_consumer", new java.lang.Integer (0));
    _methods.put ("disconnect_push_supplier", new java.lang.Integer (1));
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
       case 0:  // CosEventChannelAdmin/ProxyPushSupplier/connect_push_consumer
       {
         try {
           CosEventComm.PushConsumer push_consumer = CosEventComm.PushConsumerHelper.read (in);
           this.connect_push_consumer (push_consumer);
           out = $rh.createReply();
         } catch (CosEventChannelAdmin.AlreadyConnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventChannelAdmin.AlreadyConnectedHelper.write (out, $ex);
         } catch (CosEventChannelAdmin.TypeError $ex) {
           out = $rh.createExceptionReply ();
           CosEventChannelAdmin.TypeErrorHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // CosEventComm/PushSupplier/disconnect_push_supplier
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
    "IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0", 
    "IDL:omg.org/CosEventComm/PushSupplier:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ProxyPushSupplier _this() 
  {
    return ProxyPushSupplierHelper.narrow(
    super._this_object());
  }

  public ProxyPushSupplier _this(org.omg.CORBA.ORB orb) 
  {
    return ProxyPushSupplierHelper.narrow(
    super._this_object(orb));
  }


} // class ProxyPushSupplierPOA
