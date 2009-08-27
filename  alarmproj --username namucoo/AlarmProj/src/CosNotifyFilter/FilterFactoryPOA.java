package CosNotifyFilter;


/**
* CosNotifyFilter/FilterFactoryPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/


// MappingFilter
public abstract class FilterFactoryPOA extends org.omg.PortableServer.Servant
 implements CosNotifyFilter.FilterFactoryOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("create_filter", new java.lang.Integer (0));
    _methods.put ("create_mapping_filter", new java.lang.Integer (1));
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
       case 0:  // CosNotifyFilter/FilterFactory/create_filter
       {
         try {
           String constraint_grammar = in.read_string ();
           CosNotifyFilter.Filter $result = null;
           $result = this.create_filter (constraint_grammar);
           out = $rh.createReply();
           CosNotifyFilter.FilterHelper.write (out, $result);
         } catch (CosNotifyFilter.InvalidGrammar $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidGrammarHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // CosNotifyFilter/FilterFactory/create_mapping_filter
       {
         try {
           String constraint_grammar = in.read_string ();
           org.omg.CORBA.Any default_value = in.read_any ();
           CosNotifyFilter.MappingFilter $result = null;
           $result = this.create_mapping_filter (constraint_grammar, default_value);
           out = $rh.createReply();
           CosNotifyFilter.MappingFilterHelper.write (out, $result);
         } catch (CosNotifyFilter.InvalidGrammar $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidGrammarHelper.write (out, $ex);
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
    "IDL:omg.org/CosNotifyFilter/FilterFactory:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public FilterFactory _this() 
  {
    return FilterFactoryHelper.narrow(
    super._this_object());
  }

  public FilterFactory _this(org.omg.CORBA.ORB orb) 
  {
    return FilterFactoryHelper.narrow(
    super._this_object(orb));
  }


} // class FilterFactoryPOA
