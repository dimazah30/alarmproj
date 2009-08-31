package NotificationIRPSystem;


/**
* NotificationIRPSystem/_NotificationIRPStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分30秒 CST
*/

public class _NotificationIRPStub extends org.omg.CORBA.portable.ObjectImpl implements NotificationIRPSystem.NotificationIRP
{


  /*
        Return the list of all supported Notification IRP versions
        Each IRPVersion is defined by the rule in TS 32.311 clause titled
        "IRP document version number string"
        */
  public String[] get_notification_IRP_versions () throws NotificationIRPSystem.GetNotificationIRPVersions
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_notification_IRP_versions", true);
                $in = _invoke ($out);
                String $result[] = ManagedGenericIRPConstDefs.VersionNumberSetHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/GetNotificationIRPVersions:1.0"))
                    throw NotificationIRPSystem.GetNotificationIRPVersionsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_notification_IRP_versions (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_notification_IRP_versions


  /*
        Return the list of all supported operations and their supported
        parameters for a specific Notification IRP version.
        */
  public ManagedGenericIRPConstDefs.Method[] get_notification_IRP_operations_profile (String notification_irp_version) throws NotificationIRPSystem.GetNotificationIRPOperationsProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_notification_IRP_operations_profile", true);
                ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, notification_irp_version);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Method $result[] = ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/GetNotificationIRPOperationsProfile:1.0"))
                    throw NotificationIRPSystem.GetNotificationIRPOperationsProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_notification_IRP_operations_profile (notification_irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_notification_IRP_operations_profile


  /*
        Return the list of all supported notifications.
        Agent should always throw a ManagedGenericIRPSystem::OperationNotSupported
        exception.
        Similar method, such as get_alarm_IRP_notification_profile,
        is supported in other IRP versions such as Alarm IRP.
        */
  public ManagedGenericIRPConstDefs.Method[] get_notification_IRP_notification_profile (String notification_irp_version) throws NotificationIRPSystem.GetNotificationIRPNotificationProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_notification_IRP_notification_profile", true);
                ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, notification_irp_version);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Method $result[] = ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/GetNotificationIRPNotificationProfile:1.0"))
                    throw NotificationIRPSystem.GetNotificationIRPNotificationProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_notification_IRP_notification_profile (notification_irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_notification_IRP_notification_profile


  /*
        Obtain the list of all supported notification categories.
        */
  public String[] get_notification_categories (NotificationIRPConstDefs.NotificationTypesSetHolder notification_type_list) throws NotificationIRPSystem.GetNotificationCategories, ManagedGenericIRPSystem.OperationNotSupported
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_notification_categories", true);
                $in = _invoke ($out);
                String $result[] = NotificationIRPConstDefs.NotificationCategorySetHelper.read ($in);
                notification_type_list.value = NotificationIRPConstDefs.NotificationTypesSetHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/GetNotificationCategories:1.0"))
                    throw NotificationIRPSystem.GetNotificationCategoriesHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_notification_categories (notification_type_list        );
            } finally {
                _releaseReply ($in);
            }
  } // get_notification_categories

  public String attach_push (String manager_reference, int time_tick, String[] notification_categories, ManagedGenericIRPConstDefs.StringTypeOpt filter) throws NotificationIRPSystem.Attach, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter, NotificationIRPSystem.AlreadySubscribed, NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("attach_push", true);
                $out.write_string (manager_reference);
                $out.write_ulong (time_tick);
                NotificationIRPConstDefs.NotificationCategorySetHelper.write ($out, notification_categories);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, filter);
                $in = _invoke ($out);
                String $result = NotificationIRPConstDefs.SubscriptionIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/Attach:1.0"))
                    throw NotificationIRPSystem.AttachHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/AlreadySubscribed:1.0"))
                    throw NotificationIRPSystem.AlreadySubscribedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupported:1.0"))
                    throw NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return attach_push (manager_reference, time_tick, notification_categories, filter        );
            } finally {
                _releaseReply ($in);
            }
  } // attach_push

  public String attach_push_b (String manager_reference, int time_tick, String[] notification_categories, ManagedGenericIRPConstDefs.StringTypeOpt filter, CosNotifyChannelAdmin.SequenceProxyPushSupplierHolder system_reference) throws NotificationIRPSystem.Attach, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter, NotificationIRPSystem.AlreadySubscribed, NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("attach_push_b", true);
                $out.write_string (manager_reference);
                $out.write_ulong (time_tick);
                NotificationIRPConstDefs.NotificationCategorySetHelper.write ($out, notification_categories);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, filter);
                $in = _invoke ($out);
                String $result = NotificationIRPConstDefs.SubscriptionIdHelper.read ($in);
                system_reference.value = CosNotifyChannelAdmin.SequenceProxyPushSupplierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/Attach:1.0"))
                    throw NotificationIRPSystem.AttachHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/AlreadySubscribed:1.0"))
                    throw NotificationIRPSystem.AlreadySubscribedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupported:1.0"))
                    throw NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return attach_push_b (manager_reference, time_tick, notification_categories, filter, system_reference        );
            } finally {
                _releaseReply ($in);
            }
  } // attach_push_b

  public String attach_pull (String manager_reference, int time_tick, String[] notification_categories, ManagedGenericIRPConstDefs.StringTypeOpt filter, CosNotifyChannelAdmin.SequenceProxyPullSupplierHolder system_reference) throws NotificationIRPSystem.Attach, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter, NotificationIRPSystem.AlreadySubscribed, NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("attach_pull", true);
                $out.write_string (manager_reference);
                $out.write_ulong (time_tick);
                NotificationIRPConstDefs.NotificationCategorySetHelper.write ($out, notification_categories);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, filter);
                $in = _invoke ($out);
                String $result = NotificationIRPConstDefs.SubscriptionIdHelper.read ($in);
                system_reference.value = CosNotifyChannelAdmin.SequenceProxyPullSupplierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/Attach:1.0"))
                    throw NotificationIRPSystem.AttachHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/AlreadySubscribed:1.0"))
                    throw NotificationIRPSystem.AlreadySubscribedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/AtLeastOneNotificationCategoryNotSupported:1.0"))
                    throw NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupportedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return attach_pull (manager_reference, time_tick, notification_categories, filter, system_reference        );
            } finally {
                _releaseReply ($in);
            }
  } // attach_pull


  /*
        Replace the present filter constraint with the one provided.
        */
  public void change_subscription_filter (String subscription_id, String filter) throws NotificationIRPSystem.ChangeSubscriptionFilter, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("change_subscription_filter", true);
                NotificationIRPConstDefs.SubscriptionIdHelper.write ($out, subscription_id);
                $out.write_string (filter);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/ChangeSubscriptionFilter:1.0"))
                    throw NotificationIRPSystem.ChangeSubscriptionFilterHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                change_subscription_filter (subscription_id, filter        );
            } finally {
                _releaseReply ($in);
            }
  } // change_subscription_filter


  /*
        Check the current state of the subscription.
        */
  public String[] get_subscription_status (String subscription_id, ManagedGenericIRPConstDefs.StringTypeOptHolder filter_in_effect, NotificationIRPConstDefs.SubscriptionStateHolder subscription_state, org.omg.CORBA.IntHolder time_tick) throws NotificationIRPSystem.GetSubscriptionStatus, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_subscription_status", true);
                NotificationIRPConstDefs.SubscriptionIdHelper.write ($out, subscription_id);
                $in = _invoke ($out);
                String $result[] = NotificationIRPConstDefs.NotificationCategorySetHelper.read ($in);
                filter_in_effect.value = ManagedGenericIRPConstDefs.StringTypeOptHelper.read ($in);
                subscription_state.value = NotificationIRPConstDefs.SubscriptionStateHelper.read ($in);
                time_tick.value = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/GetSubscriptionStatus:1.0"))
                    throw NotificationIRPSystem.GetSubscriptionStatusHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_subscription_status (subscription_id, filter_in_effect, subscription_state, time_tick        );
            } finally {
                _releaseReply ($in);
            }
  } // get_subscription_status

  public String[] get_subscription_ids (String manager_reference) throws NotificationIRPSystem.GetSubscriptionIds, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_subscription_ids", true);
                $out.write_string (manager_reference);
                $in = _invoke ($out);
                String $result[] = NotificationIRPConstDefs.SubscriptionIdSetHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/GetSubscriptionIds:1.0"))
                    throw NotificationIRPSystem.GetSubscriptionIdsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_subscription_ids (manager_reference        );
            } finally {
                _releaseReply ($in);
            }
  } // get_subscription_ids


  /*
        Terminates the subscription with the agent.
        */
  public void detach (String manager_reference, String subscription_id) throws NotificationIRPSystem.DetachException, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("detach", true);
                $out.write_string (manager_reference);
                NotificationIRPConstDefs.SubscriptionIdHelper.write ($out, subscription_id);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/NotificationIRPSystem/DetachException:1.0"))
                    throw NotificationIRPSystem.DetachExceptionHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                detach (manager_reference, subscription_id        );
            } finally {
                _releaseReply ($in);
            }
  } // detach

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/NotificationIRPSystem/NotificationIRP:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _NotificationIRPStub
