package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullConsumerPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy pull consumer.
    */
public abstract class ProxyPullConsumerPOA extends org.omg.PortableServer.Servant
 implements CosEventChannelAdmin.ProxyPullConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect_pull_supplier", new java.lang.Integer (0));
    _methods.put ("disconnect_pull_consumer", new java.lang.Integer (1));
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
         * Connect a pull supplier to this proxy.
         * @parm <code>pull_supplier</code> - The <code>PullSupplier</code>
         * object reference.
         * @raises AlreadyConnected If this supplier is already connected.
         * @raises TypeError Illegal supplier type.
         */
       case 0:  // CosEventChannelAdmin/ProxyPullConsumer/connect_pull_supplier
       {
         try {
           CosEventComm.PullSupplier pull_supplier = CosEventComm.PullSupplierHelper.read (in);
           this.connect_pull_supplier (pull_supplier);
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


  /**
       * Disconnect a pull consumer.
       */
       case 1:  // CosEventComm/PullConsumer/disconnect_pull_consumer
       {
         this.disconnect_pull_consumer ();
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
    "IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0", 
    "IDL:omg.org/CosEventComm/PullConsumer:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ProxyPullConsumer _this() 
  {
    return ProxyPullConsumerHelper.narrow(
    super._this_object());
  }

  public ProxyPullConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return ProxyPullConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class ProxyPullConsumerPOA
