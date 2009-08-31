package CosNotifyFilter;


/**
* CosNotifyFilter/FilterPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public abstract class FilterPOA extends org.omg.PortableServer.Servant
 implements CosNotifyFilter.FilterOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_constraint_grammar", new java.lang.Integer (0));
    _methods.put ("add_constraints", new java.lang.Integer (1));
    _methods.put ("modify_constraints", new java.lang.Integer (2));
    _methods.put ("get_constraints", new java.lang.Integer (3));
    _methods.put ("get_all_constraints", new java.lang.Integer (4));
    _methods.put ("remove_all_constraints", new java.lang.Integer (5));
    _methods.put ("destroy", new java.lang.Integer (6));
    _methods.put ("match", new java.lang.Integer (7));
    _methods.put ("match_structured", new java.lang.Integer (8));
    _methods.put ("match_typed", new java.lang.Integer (9));
    _methods.put ("attach_callback", new java.lang.Integer (10));
    _methods.put ("detach_callback", new java.lang.Integer (11));
    _methods.put ("get_callbacks", new java.lang.Integer (12));
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
       case 0:  // CosNotifyFilter/Filter/_get_constraint_grammar
       {
         String $result = null;
         $result = this.constraint_grammar ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // CosNotifyFilter/Filter/add_constraints
       {
         try {
           CosNotifyFilter.ConstraintExp constraint_list[] = CosNotifyFilter.ConstraintExpSeqHelper.read (in);
           CosNotifyFilter.ConstraintInfo $result[] = null;
           $result = this.add_constraints (constraint_list);
           out = $rh.createReply();
           CosNotifyFilter.ConstraintInfoSeqHelper.write (out, $result);
         } catch (CosNotifyFilter.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidConstraintHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // CosNotifyFilter/Filter/modify_constraints
       {
         try {
           int del_list[] = CosNotifyFilter.ConstraintIDSeqHelper.read (in);
           CosNotifyFilter.ConstraintInfo modify_list[] = CosNotifyFilter.ConstraintInfoSeqHelper.read (in);
           this.modify_constraints (del_list, modify_list);
           out = $rh.createReply();
         } catch (CosNotifyFilter.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidConstraintHelper.write (out, $ex);
         } catch (CosNotifyFilter.ConstraintNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.ConstraintNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // CosNotifyFilter/Filter/get_constraints
       {
         try {
           int id_list[] = CosNotifyFilter.ConstraintIDSeqHelper.read (in);
           CosNotifyFilter.ConstraintInfo $result[] = null;
           $result = this.get_constraints (id_list);
           out = $rh.createReply();
           CosNotifyFilter.ConstraintInfoSeqHelper.write (out, $result);
         } catch (CosNotifyFilter.ConstraintNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.ConstraintNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // CosNotifyFilter/Filter/get_all_constraints
       {
         CosNotifyFilter.ConstraintInfo $result[] = null;
         $result = this.get_all_constraints ();
         out = $rh.createReply();
         CosNotifyFilter.ConstraintInfoSeqHelper.write (out, $result);
         break;
       }

       case 5:  // CosNotifyFilter/Filter/remove_all_constraints
       {
         this.remove_all_constraints ();
         out = $rh.createReply();
         break;
       }

       case 6:  // CosNotifyFilter/Filter/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }

       case 7:  // CosNotifyFilter/Filter/match
       {
         try {
           org.omg.CORBA.Any filterable_data = in.read_any ();
           boolean $result = false;
           $result = this.match (filterable_data);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (CosNotifyFilter.UnsupportedFilterableData $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.UnsupportedFilterableDataHelper.write (out, $ex);
         }
         break;
       }

       case 8:  // CosNotifyFilter/Filter/match_structured
       {
         try {
           CosNotification.StructuredEvent filterable_data = CosNotification.StructuredEventHelper.read (in);
           boolean $result = false;
           $result = this.match_structured (filterable_data);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (CosNotifyFilter.UnsupportedFilterableData $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.UnsupportedFilterableDataHelper.write (out, $ex);
         }
         break;
       }

       case 9:  // CosNotifyFilter/Filter/match_typed
       {
         try {
           CosNotification.Property filterable_data[] = CosNotification.PropertySeqHelper.read (in);
           boolean $result = false;
           $result = this.match_typed (filterable_data);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (CosNotifyFilter.UnsupportedFilterableData $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.UnsupportedFilterableDataHelper.write (out, $ex);
         }
         break;
       }

       case 10:  // CosNotifyFilter/Filter/attach_callback
       {
         CosNotifyComm.NotifySubscribe callback = CosNotifyComm.NotifySubscribeHelper.read (in);
         int $result = (int)0;
         $result = this.attach_callback (callback);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 11:  // CosNotifyFilter/Filter/detach_callback
       {
         try {
           int callback = CosNotifyFilter.CallbackIDHelper.read (in);
           this.detach_callback (callback);
           out = $rh.createReply();
         } catch (CosNotifyFilter.CallbackNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.CallbackNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 12:  // CosNotifyFilter/Filter/get_callbacks
       {
         int $result[] = null;
         $result = this.get_callbacks ();
         out = $rh.createReply();
         CosNotifyFilter.CallbackIDSeqHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyFilter/Filter:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Filter _this() 
  {
    return FilterHelper.narrow(
    super._this_object());
  }

  public Filter _this(org.omg.CORBA.ORB orb) 
  {
    return FilterHelper.narrow(
    super._this_object(orb));
  }


} // class FilterPOA
