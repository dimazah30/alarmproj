package NotificationIRPSystem;


/**
* NotificationIRPSystem/NotificationIRPPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分30秒 CST
*/

public abstract class NotificationIRPPOA extends org.omg.PortableServer.Servant
 implements NotificationIRPSystem.NotificationIRPOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_notification_IRP_versions", new java.lang.Integer (0));
    _methods.put ("get_notification_IRP_operations_profile", new java.lang.Integer (1));
    _methods.put ("get_notification_IRP_notification_profile", new java.lang.Integer (2));
    _methods.put ("get_notification_categories", new java.lang.Integer (3));
    _methods.put ("attach_push", new java.lang.Integer (4));
    _methods.put ("attach_push_b", new java.lang.Integer (5));
    _methods.put ("attach_pull", new java.lang.Integer (6));
    _methods.put ("change_subscription_filter", new java.lang.Integer (7));
    _methods.put ("get_subscription_status", new java.lang.Integer (8));
    _methods.put ("get_subscription_ids", new java.lang.Integer (9));
    _methods.put ("detach", new java.lang.Integer (10));
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

  /*
        Return the list of all supported Notification IRP versions
        Each IRPVersion is defined by the rule in TS 32.311 clause titled
        "IRP document version number string"
        */
       case 0:  // NotificationIRPSystem/NotificationIRP/get_notification_IRP_versions
       {
         try {
           String $result[] = null;
           $result = this.get_notification_IRP_versions ();
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, $result);
         } catch (NotificationIRPSystem.GetNotificationIRPVersions $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.GetNotificationIRPVersionsHelper.write (out, $ex);
         }
         break;
       }


  /*
        Return the list of all supported operations and their supported
        parameters for a specific Notification IRP version.
        */
       case 1:  // NotificationIRPSystem/NotificationIRP/get_notification_IRP_operations_profile
       {
         try {
           String notification_irp_version = ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_notification_IRP_operations_profile (notification_irp_version);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (NotificationIRPSystem.GetNotificationIRPOperationsProfile $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.GetNotificationIRPOperationsProfileHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        Return the list of all supported notifications.
        Agent should always throw a ManagedGenericIRPSystem::OperationNotSupported
        exception.
        Similar method, such as get_alarm_IRP_notification_profile,
        is supported in other IRP versions such as Alarm IRP.
        */
       case 2:  // NotificationIRPSystem/NotificationIRP/get_notification_IRP_notification_profile
       {
         try {
           String notification_irp_version = ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_notification_IRP_notification_profile (notification_irp_version);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (NotificationIRPSystem.GetNotificationIRPNotificationProfile $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.GetNotificationIRPNotificationProfileHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        Obtain the list of all supported notification categories.
        */
       case 3:  // NotificationIRPSystem/NotificationIRP/get_notification_categories
       {
         try {
           NotificationIRPConstDefs.NotificationTypesSetHolder notification_type_list = new NotificationIRPConstDefs.NotificationTypesSetHolder ();
           String $result[] = null;
           $result = this.get_notification_categories (notification_type_list);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, $result);
           NotificationIRPConstDefs.NotificationTypesSetHelper.write (out, notification_type_list.value);
         } catch (NotificationIRPSystem.GetNotificationCategories $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.GetNotificationCategoriesHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // NotificationIRPSystem/NotificationIRP/attach_push
       {
         try {
           String manager_reference = in.read_string ();
           int time_tick = in.read_ulong ();
           String notification_categories[] = NotificationIRPConstDefs.NotificationCategorySetHelper.read (in);
           ManagedGenericIRPConstDefs.StringTypeOpt filter = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           String $result = null;
           $result = this.attach_push (manager_reference, time_tick, notification_categories, filter);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (NotificationIRPSystem.Attach $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AttachHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         } catch (NotificationIRPSystem.AlreadySubscribed $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AlreadySubscribedHelper.write (out, $ex);
         } catch (NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // NotificationIRPSystem/NotificationIRP/attach_push_b
       {
         try {
           String manager_reference = in.read_string ();
           int time_tick = in.read_ulong ();
           String notification_categories[] = NotificationIRPConstDefs.NotificationCategorySetHelper.read (in);
           ManagedGenericIRPConstDefs.StringTypeOpt filter = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           CosNotifyChannelAdmin.SequenceProxyPushSupplierHolder system_reference = new CosNotifyChannelAdmin.SequenceProxyPushSupplierHolder ();
           String $result = null;
           $result = this.attach_push_b (manager_reference, time_tick, notification_categories, filter, system_reference);
           out = $rh.createReply();
           out.write_string ($result);
           CosNotifyChannelAdmin.SequenceProxyPushSupplierHelper.write (out, system_reference.value);
         } catch (NotificationIRPSystem.Attach $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AttachHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         } catch (NotificationIRPSystem.AlreadySubscribed $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AlreadySubscribedHelper.write (out, $ex);
         } catch (NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.write (out, $ex);
         }
         break;
       }

       case 6:  // NotificationIRPSystem/NotificationIRP/attach_pull
       {
         try {
           String manager_reference = in.read_string ();
           int time_tick = in.read_ulong ();
           String notification_categories[] = NotificationIRPConstDefs.NotificationCategorySetHelper.read (in);
           ManagedGenericIRPConstDefs.StringTypeOpt filter = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           CosNotifyChannelAdmin.SequenceProxyPullSupplierHolder system_reference = new CosNotifyChannelAdmin.SequenceProxyPullSupplierHolder ();
           String $result = null;
           $result = this.attach_pull (manager_reference, time_tick, notification_categories, filter, system_reference);
           out = $rh.createReply();
           out.write_string ($result);
           CosNotifyChannelAdmin.SequenceProxyPullSupplierHelper.write (out, system_reference.value);
         } catch (NotificationIRPSystem.Attach $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AttachHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         } catch (NotificationIRPSystem.AlreadySubscribed $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AlreadySubscribedHelper.write (out, $ex);
         } catch (NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.write (out, $ex);
         }
         break;
       }


  /*
        Replace the present filter constraint with the one provided.
        */
       case 7:  // NotificationIRPSystem/NotificationIRP/change_subscription_filter
       {
         try {
           String subscription_id = NotificationIRPConstDefs.SubscriptionIdHelper.read (in);
           String filter = in.read_string ();
           this.change_subscription_filter (subscription_id, filter);
           out = $rh.createReply();
         } catch (NotificationIRPSystem.ChangeSubscriptionFilter $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.ChangeSubscriptionFilterHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        Check the current state of the subscription.
        */
       case 8:  // NotificationIRPSystem/NotificationIRP/get_subscription_status
       {
         try {
           String subscription_id = NotificationIRPConstDefs.SubscriptionIdHelper.read (in);
           ManagedGenericIRPConstDefs.StringTypeOptHolder filter_in_effect = new ManagedGenericIRPConstDefs.StringTypeOptHolder ();
           NotificationIRPConstDefs.SubscriptionStateHolder subscription_state = new NotificationIRPConstDefs.SubscriptionStateHolder ();
           org.omg.CORBA.IntHolder time_tick = new org.omg.CORBA.IntHolder ();
           String $result[] = null;
           $result = this.get_subscription_status (subscription_id, filter_in_effect, subscription_state, time_tick);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, $result);
           ManagedGenericIRPConstDefs.StringTypeOptHelper.write (out, filter_in_effect.value);
           NotificationIRPConstDefs.SubscriptionStateHelper.write (out, subscription_state.value);
           out.write_ulong (time_tick.value);
         } catch (NotificationIRPSystem.GetSubscriptionStatus $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.GetSubscriptionStatusHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }

       case 9:  // NotificationIRPSystem/NotificationIRP/get_subscription_ids
       {
         try {
           String manager_reference = in.read_string ();
           String $result[] = null;
           $result = this.get_subscription_ids (manager_reference);
           out = $rh.createReply();
           NotificationIRPConstDefs.SubscriptionIdSetHelper.write (out, $result);
         } catch (NotificationIRPSystem.GetSubscriptionIds $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.GetSubscriptionIdsHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        Terminates the subscription with the agent.
        */
       case 10:  // NotificationIRPSystem/NotificationIRP/detach
       {
         try {
           String manager_reference = in.read_string ();
           String subscription_id = NotificationIRPConstDefs.SubscriptionIdHelper.read (in);
           this.detach (manager_reference, subscription_id);
           out = $rh.createReply();
         } catch (NotificationIRPSystem.DetachException $ex) {
           out = $rh.createExceptionReply ();
           NotificationIRPSystem.DetachExceptionHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
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
    "IDL:3gppsa5.org/NotificationIRPSystem/NotificationIRP:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NotificationIRP _this() 
  {
    return NotificationIRPHelper.narrow(
    super._this_object());
  }

  public NotificationIRP _this(org.omg.CORBA.ORB orb) 
  {
    return NotificationIRPHelper.narrow(
    super._this_object(orb));
  }


} // class NotificationIRPPOA
