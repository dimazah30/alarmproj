package CosNotification;


/**
* CosNotification/AdminPropertiesAdminPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/


// MaxSuppliers takes on a value of type long
public abstract class AdminPropertiesAdminPOA extends org.omg.PortableServer.Servant
 implements CosNotification.AdminPropertiesAdminOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_admin", new java.lang.Integer (0));
    _methods.put ("set_admin", new java.lang.Integer (1));
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
       case 0:  // CosNotification/AdminPropertiesAdmin/get_admin
       {
         CosNotification.Property $result[] = null;
         $result = this.get_admin ();
         out = $rh.createReply();
         CosNotification.PropertySeqHelper.write (out, $result);
         break;
       }

       case 1:  // CosNotification/AdminPropertiesAdmin/set_admin
       {
         try {
           CosNotification.Property admin[] = CosNotification.AdminPropertiesHelper.read (in);
           this.set_admin (admin);
           out = $rh.createReply();
         } catch (CosNotification.UnsupportedAdmin $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedAdminHelper.write (out, $ex);
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
    "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public AdminPropertiesAdmin _this() 
  {
    return AdminPropertiesAdminHelper.narrow(
    super._this_object());
  }

  public AdminPropertiesAdmin _this(org.omg.CORBA.ORB orb) 
  {
    return AdminPropertiesAdminHelper.narrow(
    super._this_object(orb));
  }


} // class AdminPropertiesAdminPOA
