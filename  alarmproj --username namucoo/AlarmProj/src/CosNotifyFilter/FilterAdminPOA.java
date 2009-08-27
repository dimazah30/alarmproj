package CosNotifyFilter;


/**
* CosNotifyFilter/FilterAdminPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public abstract class FilterAdminPOA extends org.omg.PortableServer.Servant
 implements CosNotifyFilter.FilterAdminOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("add_filter", new java.lang.Integer (0));
    _methods.put ("remove_filter", new java.lang.Integer (1));
    _methods.put ("get_filter", new java.lang.Integer (2));
    _methods.put ("get_all_filters", new java.lang.Integer (3));
    _methods.put ("remove_all_filters", new java.lang.Integer (4));
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
       case 0:  // CosNotifyFilter/FilterAdmin/add_filter
       {
         CosNotifyFilter.Filter new_filter = CosNotifyFilter.FilterHelper.read (in);
         int $result = (int)0;
         $result = this.add_filter (new_filter);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // CosNotifyFilter/FilterAdmin/remove_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           this.remove_filter (filter);
           out = $rh.createReply();
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // CosNotifyFilter/FilterAdmin/get_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           CosNotifyFilter.Filter $result = null;
           $result = this.get_filter (filter);
           out = $rh.createReply();
           CosNotifyFilter.FilterHelper.write (out, $result);
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // CosNotifyFilter/FilterAdmin/get_all_filters
       {
         int $result[] = null;
         $result = this.get_all_filters ();
         out = $rh.createReply();
         CosNotifyFilter.FilterIDSeqHelper.write (out, $result);
         break;
       }

       case 4:  // CosNotifyFilter/FilterAdmin/remove_all_filters
       {
         this.remove_all_filters ();
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
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public FilterAdmin _this() 
  {
    return FilterAdminHelper.narrow(
    super._this_object());
  }

  public FilterAdmin _this(org.omg.CORBA.ORB orb) 
  {
    return FilterAdminHelper.narrow(
    super._this_object(orb));
  }


} // class FilterAdminPOA
