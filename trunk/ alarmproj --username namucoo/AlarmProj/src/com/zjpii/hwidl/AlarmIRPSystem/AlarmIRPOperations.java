package AlarmIRPSystem;


/**
* AlarmIRPSystem/AlarmIRPOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public interface AlarmIRPOperations 
{

  /*
        Return the list of all supported Alarm IRP versions.
        Implementations are to provide a return value consisting of one or more
        IRPVersions.
        Each IRPVersion is defined by the rule in the clause titled
        "IRP document version number string"
        */
  String[] get_alarm_IRP_versions () throws AlarmIRPSystem.GetAlarmIRPVersions;

  /*
        Return the list of all supported operations and their supported
        parameters for a specific Alarm IRP version.
        */
  ManagedGenericIRPConstDefs.Method[] get_alarm_IRP_operations_profile (String alarm_irp_version) throws AlarmIRPSystem.GetAlarmIRPOperationsProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Return the list of all supported notifications and their supported
        parameters for a specific Alarm IRP version.
        */
  ManagedGenericIRPConstDefs.Method[] get_alarm_IRP_notification_profile (String alarm_irp_version) throws AlarmIRPSystem.GetAlarmIRPNotificationProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Request to acknowledge one or more alarms.
        */
  ManagedGenericIRPConstDefs.Signal acknowledge_alarms (AlarmIRPConstDefs.AlarmInformationIdAndSev[] alarm_information_id_and_sev_list, String ack_user_id, ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id, AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHolder bad_ack_alarm_info_list) throws AlarmIRPSystem.AcknowledgeAlarms, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Request to remove acknowledgement information of one or more alarms.
        */
  ManagedGenericIRPConstDefs.Signal unacknowledge_alarms (String[] alarm_information_id_list, String ack_user_id, ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id, AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws AlarmIRPSystem.UnacknowledgeAlarms, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Make comment to one or more alarms.
        */
  ManagedGenericIRPConstDefs.Signal comment_alarms (String[] alarm_information_id_list, String comment_user_id, ManagedGenericIRPConstDefs.StringTypeOpt comment_system_id, String comment_text, AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws AlarmIRPSystem.CommentAlarms, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        Request to clear one or more alarms.
        */
  ManagedGenericIRPConstDefs.Signal clear_alarms (String[] alarm_information_id_list, String clear_user_id, ManagedGenericIRPConstDefs.StringTypeOpt clear_system_id, AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws AlarmIRPSystem.ClearAlarms, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        This method returns Alarm Informations.
        If flag is TRUE, all returned Alarm Informations shall be
        in AlarmInformationSeq that contains 0 or more Alarm Informations.
        Output parameter iter shall be useless.
        If flag is FALSE, no Alarm Informations shall be in AlarmInformationSeq.
        IRPAgent needs to use iter to retrieve them.
        */
  CosNotification.StructuredEvent[] get_alarm_list (ManagedGenericIRPConstDefs.StringTypeOpt filter, AlarmIRPConstDefs.DNTypeOpt base_object, org.omg.CORBA.BooleanHolder flag, AlarmIRPSystem.AlarmInformationIteratorHolder iter) throws AlarmIRPSystem.GetAlarmList, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /*
        This method returns the count of Alarm Informations.
        */
  void get_alarm_count (ManagedGenericIRPConstDefs.StringTypeOpt filter, org.omg.CORBA.IntHolder critical_count, org.omg.CORBA.IntHolder major_count, org.omg.CORBA.IntHolder minor_count, org.omg.CORBA.IntHolder warning_count, org.omg.CORBA.IntHolder indeterminate_count, org.omg.CORBA.IntHolder cleared_count) throws AlarmIRPSystem.GetAlarmCount, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter;
} // interface AlarmIRPOperations
