package CosNotifyFilter;


/**
* CosNotifyFilter/MappingFilterPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/


// Filter
public abstract class MappingFilterPOA extends org.omg.PortableServer.Servant
 implements CosNotifyFilter.MappingFilterOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_constraint_grammar", new java.lang.Integer (0));
    _methods.put ("_get_default_value", new java.lang.Integer (1));
    _methods.put ("add_mapping_constraints", new java.lang.Integer (2));
    _methods.put ("modify_mapping_constraints", new java.lang.Integer (3));
    _methods.put ("get_mapping_constraints", new java.lang.Integer (4));
    _methods.put ("get_all_mapping_constraints", new java.lang.Integer (5));
    _methods.put ("remove_all_mapping_constraints", new java.lang.Integer (6));
    _methods.put ("destroy", new java.lang.Integer (7));
    _methods.put ("match", new java.lang.Integer (8));
    _methods.put ("match_structured", new java.lang.Integer (9));
    _methods.put ("match_typed", new java.lang.Integer (10));
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
       case 0:  // CosNotifyFilter/MappingFilter/_get_constraint_grammar
       {
         String $result = null;
         $result = this.constraint_grammar ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // CosNotifyFilter/MappingFilter/_get_default_value
       {
         org.omg.CORBA.Any $result = null;
         $result = this.default_value ();
         out = $rh.createReply();
         out.write_any ($result);
         break;
       }

       case 2:  // CosNotifyFilter/MappingFilter/add_mapping_constraints
       {
         try {
           CosNotifyFilter.MappingConstraintPair pair_list[] = CosNotifyFilter.MappingConstraintPairSeqHelper.read (in);
           CosNotifyFilter.MappingConstraintInfo $result[] = null;
           $result = this.add_mapping_constraints (pair_list);
           out = $rh.createReply();
           CosNotifyFilter.MappingConstraintInfoSeqHelper.write (out, $result);
         } catch (CosNotifyFilter.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidConstraintHelper.write (out, $ex);
         } catch (CosNotifyFilter.InvalidValue $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidValueHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // CosNotifyFilter/MappingFilter/modify_mapping_constraints
       {
         try {
           int del_list[] = CosNotifyFilter.ConstraintIDSeqHelper.read (in);
           CosNotifyFilter.MappingConstraintInfo modify_list[] = CosNotifyFilter.MappingConstraintInfoSeqHelper.read (in);
           this.modify_mapping_constraints (del_list, modify_list);
           out = $rh.createReply();
         } catch (CosNotifyFilter.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidConstraintHelper.write (out, $ex);
         } catch (CosNotifyFilter.InvalidValue $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.InvalidValueHelper.write (out, $ex);
         } catch (CosNotifyFilter.ConstraintNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.ConstraintNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // CosNotifyFilter/MappingFilter/get_mapping_constraints
       {
         try {
           int id_list[] = CosNotifyFilter.ConstraintIDSeqHelper.read (in);
           CosNotifyFilter.MappingConstraintInfo $result[] = null;
           $result = this.get_mapping_constraints (id_list);
           out = $rh.createReply();
           CosNotifyFilter.MappingConstraintInfoSeqHelper.write (out, $result);
         } catch (CosNotifyFilter.ConstraintNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.ConstraintNotFoundHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // CosNotifyFilter/MappingFilter/get_all_mapping_constraints
       {
         CosNotifyFilter.MappingConstraintInfo $result[] = null;
         $result = this.get_all_mapping_constraints ();
         out = $rh.createReply();
         CosNotifyFilter.MappingConstraintInfoSeqHelper.write (out, $result);
         break;
       }

       case 6:  // CosNotifyFilter/MappingFilter/remove_all_mapping_constraints
       {
         this.remove_all_mapping_constraints ();
         out = $rh.createReply();
         break;
       }

       case 7:  // CosNotifyFilter/MappingFilter/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }

       case 8:  // CosNotifyFilter/MappingFilter/match
       {
         try {
           org.omg.CORBA.Any filterable_data = in.read_any ();
           org.omg.CORBA.AnyHolder result_to_set = new org.omg.CORBA.AnyHolder ();
           boolean $result = false;
           $result = this.match (filterable_data, result_to_set);
           out = $rh.createReply();
           out.write_boolean ($result);
           out.write_any (result_to_set.value);
         } catch (CosNotifyFilter.UnsupportedFilterableData $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.UnsupportedFilterableDataHelper.write (out, $ex);
         }
         break;
       }

       case 9:  // CosNotifyFilter/MappingFilter/match_structured
       {
         try {
           CosNotification.StructuredEvent filterable_data = CosNotification.StructuredEventHelper.read (in);
           org.omg.CORBA.AnyHolder result_to_set = new org.omg.CORBA.AnyHolder ();
           boolean $result = false;
           $result = this.match_structured (filterable_data, result_to_set);
           out = $rh.createReply();
           out.write_boolean ($result);
           out.write_any (result_to_set.value);
         } catch (CosNotifyFilter.UnsupportedFilterableData $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.UnsupportedFilterableDataHelper.write (out, $ex);
         }
         break;
       }

       case 10:  // CosNotifyFilter/MappingFilter/match_typed
       {
         try {
           CosNotification.Property filterable_data[] = CosNotification.PropertySeqHelper.read (in);
           org.omg.CORBA.AnyHolder result_to_set = new org.omg.CORBA.AnyHolder ();
           boolean $result = false;
           $result = this.match_typed (filterable_data, result_to_set);
           out = $rh.createReply();
           out.write_boolean ($result);
           out.write_any (result_to_set.value);
         } catch (CosNotifyFilter.UnsupportedFilterableData $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.UnsupportedFilterableDataHelper.write (out, $ex);
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
    "IDL:omg.org/CosNotifyFilter/MappingFilter:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public MappingFilter _this() 
  {
    return MappingFilterHelper.narrow(
    super._this_object());
  }

  public MappingFilter _this(org.omg.CORBA.ORB orb) 
  {
    return MappingFilterHelper.narrow(
    super._this_object(orb));
  }


} // class MappingFilterPOA
