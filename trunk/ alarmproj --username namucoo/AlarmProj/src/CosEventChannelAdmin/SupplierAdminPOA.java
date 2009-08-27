package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/SupplierAdminPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年8月26日 星期三 上午10时45分20秒 CST
*/

public abstract class SupplierAdminPOA extends org.omg.PortableServer.Servant
 implements CosEventChannelAdmin.SupplierAdminOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("obtain_push_consumer", new java.lang.Integer (0));
    _methods.put ("obtain_pull_consumer", new java.lang.Integer (1));
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
       case 0:  // CosEventChannelAdmin/SupplierAdmin/obtain_push_consumer
       {
         CosEventChannelAdmin.ProxyPushConsumer $result = null;
         $result = this.obtain_push_consumer ();
         out = $rh.createReply();
         CosEventChannelAdmin.ProxyPushConsumerHelper.write (out, $result);
         break;
       }

       case 1:  // CosEventChannelAdmin/SupplierAdmin/obtain_pull_consumer
       {
         CosEventChannelAdmin.ProxyPullConsumer $result = null;
         $result = this.obtain_pull_consumer ();
         out = $rh.createReply();
         CosEventChannelAdmin.ProxyPullConsumerHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SupplierAdmin _this() 
  {
    return SupplierAdminHelper.narrow(
    super._this_object());
  }

  public SupplierAdmin _this(org.omg.CORBA.ORB orb) 
  {
    return SupplierAdminHelper.narrow(
    super._this_object(orb));
  }


} // class SupplierAdminPOA
