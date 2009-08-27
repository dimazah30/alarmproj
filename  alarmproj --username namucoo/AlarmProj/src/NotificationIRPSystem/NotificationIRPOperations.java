package NotificationIRPSystem;


/**
* NotificationIRPSystem/NotificationIRPOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月26日 星期三 上午10时44分59秒 CST
*/

public interface NotificationIRPOperations 
{

  /*
        Return the list of all supported Notification IRP versions
        Each IRPVersion is defined by the rule in TS 32.311 clause titled
        "IRP document version number string"
        */
  String[] get_notification_IRP_versions () throws NotificationIRPSystem.GetNotificationIRPVersions;

  /*
        Return the list of all supported operations and their supported
        parameters for a specific Notification IRP version.
        */
  ManagedGenericIRPConstDefs.Method[] get_notification_IRP_operations_profile (String notification_irp_version) throws NotificationIRPSystem.GetNotificationIRPOperationsProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Return the list of all supported notifications.
        Agent should always throw a ManagedGenericIRPSystem::OperationNotSupported
        exception.
        Similar method, such as get_alarm_IRP_notification_profile,
        is supported in other IRP versions such as Alarm IRP.
        */
  ManagedGenericIRPConstDefs.Method[] get_notification_IRP_notification_profile (String notification_irp_version) throws NotificationIRPSystem.GetNotificationIRPNotificationProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Obtain the list of all supported notification categories.
        */
  String[] get_notification_categories (NotificationIRPConstDefs.NotificationTypesSetHolder notification_type_list) throws NotificationIRPSystem.GetNotificationCategories, ManagedGenericIRPSystem.OperationNotSupported;
  String attach_push (String manager_reference, int time_tick, String[] notification_categories, ManagedGenericIRPConstDefs.StringTypeOpt filter) throws NotificationIRPSystem.Attach, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter, NotificationIRPSystem.AlreadySubscribed, NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported;
  String attach_push_b (String manager_reference, int time_tick, String[] notification_categories, ManagedGenericIRPConstDefs.StringTypeOpt filter, CosNotifyChannelAdmin.SequenceProxyPushSupplierHolder system_reference) throws NotificationIRPSystem.Attach, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter, NotificationIRPSystem.AlreadySubscribed, NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported;
  String attach_pull (String manager_reference, int time_tick, String[] notification_categories, ManagedGenericIRPConstDefs.StringTypeOpt filter, CosNotifyChannelAdmin.SequenceProxyPullSupplierHolder system_reference) throws NotificationIRPSystem.Attach, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter, NotificationIRPSystem.AlreadySubscribed, NotificationIRPSystem.AtLeastOneNotificationCategoryNotSupported;

  /*
        Replace the present filter constraint with the one provided.
        */
  void change_subscription_filter (String subscription_id, String filter) throws NotificationIRPSystem.ChangeSubscriptionFilter, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Check the current state of the subscription.
        */
  String[] get_subscription_status (String subscription_id, ManagedGenericIRPConstDefs.StringTypeOptHolder filter_in_effect, NotificationIRPConstDefs.SubscriptionStateHolder subscription_state, org.omg.CORBA.IntHolder time_tick) throws NotificationIRPSystem.GetSubscriptionStatus, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;
  String[] get_subscription_ids (String manager_reference) throws NotificationIRPSystem.GetSubscriptionIds, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Terminates the subscription with the agent.
        */
  void detach (String manager_reference, String subscription_id) throws NotificationIRPSystem.DetachException, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter;
} // interface NotificationIRPOperations
