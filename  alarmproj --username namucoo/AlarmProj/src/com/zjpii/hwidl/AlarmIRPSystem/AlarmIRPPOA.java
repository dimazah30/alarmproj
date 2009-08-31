package AlarmIRPSystem;


/**
* AlarmIRPSystem/AlarmIRPPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public abstract class AlarmIRPPOA extends org.omg.PortableServer.Servant
 implements AlarmIRPSystem.AlarmIRPOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_alarm_IRP_versions", new java.lang.Integer (0));
    _methods.put ("get_alarm_IRP_operations_profile", new java.lang.Integer (1));
    _methods.put ("get_alarm_IRP_notification_profile", new java.lang.Integer (2));
    _methods.put ("acknowledge_alarms", new java.lang.Integer (3));
    _methods.put ("unacknowledge_alarms", new java.lang.Integer (4));
    _methods.put ("comment_alarms", new java.lang.Integer (5));
    _methods.put ("clear_alarms", new java.lang.Integer (6));
    _methods.put ("get_alarm_list", new java.lang.Integer (7));
    _methods.put ("get_alarm_count", new java.lang.Integer (8));
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
        Return the list of all supported Alarm IRP versions.
        Implementations are to provide a return value consisting of one or more
        IRPVersions.
        Each IRPVersion is defined by the rule in the clause titled
        "IRP document version number string"
        */
       case 0:  // AlarmIRPSystem/AlarmIRP/get_alarm_IRP_versions
       {
         try {
           String $result[] = null;
           $result = this.get_alarm_IRP_versions ();
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, $result);
         } catch (AlarmIRPSystem.GetAlarmIRPVersions $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.GetAlarmIRPVersionsHelper.write (out, $ex);
         }
         break;
       }


  /*
        Return the list of all supported operations and their supported
        parameters for a specific Alarm IRP version.
        */
       case 1:  // AlarmIRPSystem/AlarmIRP/get_alarm_IRP_operations_profile
       {
         try {
           String alarm_irp_version = ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_alarm_IRP_operations_profile (alarm_irp_version);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (AlarmIRPSystem.GetAlarmIRPOperationsProfile $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.GetAlarmIRPOperationsProfileHelper.write (out, $ex);
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
        Return the list of all supported notifications and their supported
        parameters for a specific Alarm IRP version.
        */
       case 2:  // AlarmIRPSystem/AlarmIRP/get_alarm_IRP_notification_profile
       {
         try {
           String alarm_irp_version = ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_alarm_IRP_notification_profile (alarm_irp_version);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (AlarmIRPSystem.GetAlarmIRPNotificationProfile $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.GetAlarmIRPNotificationProfileHelper.write (out, $ex);
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
        Request to acknowledge one or more alarms.
        */
       case 3:  // AlarmIRPSystem/AlarmIRP/acknowledge_alarms
       {
         try {
           AlarmIRPConstDefs.AlarmInformationIdAndSev alarm_information_id_and_sev_list[] = AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.read (in);
           String ack_user_id = in.read_string ();
           ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHolder bad_ack_alarm_info_list = new AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHolder ();
           ManagedGenericIRPConstDefs.Signal $result = null;
           $result = this.acknowledge_alarms (alarm_information_id_and_sev_list, ack_user_id, ack_system_id, bad_ack_alarm_info_list);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.SignalHelper.write (out, $result);
           AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHelper.write (out, bad_ack_alarm_info_list.value);
         } catch (AlarmIRPSystem.AcknowledgeAlarms $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.AcknowledgeAlarmsHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        Request to remove acknowledgement information of one or more alarms.
        */
       case 4:  // AlarmIRPSystem/AlarmIRP/unacknowledge_alarms
       {
         try {
           String alarm_information_id_list[] = AlarmIRPConstDefs.AlarmInformationIdSeqHelper.read (in);
           String ack_user_id = in.read_string ();
           ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list = new AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder ();
           ManagedGenericIRPConstDefs.Signal $result = null;
           $result = this.unacknowledge_alarms (alarm_information_id_list, ack_user_id, ack_system_id, bad_alarm_information_id_list);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.SignalHelper.write (out, $result);
           AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.write (out, bad_alarm_information_id_list.value);
         } catch (AlarmIRPSystem.UnacknowledgeAlarms $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.UnacknowledgeAlarmsHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        Make comment to one or more alarms.
        */
       case 5:  // AlarmIRPSystem/AlarmIRP/comment_alarms
       {
         try {
           String alarm_information_id_list[] = AlarmIRPConstDefs.AlarmInformationIdSeqHelper.read (in);
           String comment_user_id = in.read_string ();
           ManagedGenericIRPConstDefs.StringTypeOpt comment_system_id = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           String comment_text = in.read_string ();
           AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list = new AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder ();
           ManagedGenericIRPConstDefs.Signal $result = null;
           $result = this.comment_alarms (alarm_information_id_list, comment_user_id, comment_system_id, comment_text, bad_alarm_information_id_list);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.SignalHelper.write (out, $result);
           AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.write (out, bad_alarm_information_id_list.value);
         } catch (AlarmIRPSystem.CommentAlarms $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.CommentAlarmsHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        Request to clear one or more alarms.
        */
       case 6:  // AlarmIRPSystem/AlarmIRP/clear_alarms
       {
         try {
           String alarm_information_id_list[] = AlarmIRPConstDefs.AlarmInformationIdSeqHelper.read (in);
           String clear_user_id = in.read_string ();
           ManagedGenericIRPConstDefs.StringTypeOpt clear_system_id = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list = new AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder ();
           ManagedGenericIRPConstDefs.Signal $result = null;
           $result = this.clear_alarms (alarm_information_id_list, clear_user_id, clear_system_id, bad_alarm_information_id_list);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.SignalHelper.write (out, $result);
           AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.write (out, bad_alarm_information_id_list.value);
         } catch (AlarmIRPSystem.ClearAlarms $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.ClearAlarmsHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        This method returns Alarm Informations.
        If flag is TRUE, all returned Alarm Informations shall be
        in AlarmInformationSeq that contains 0 or more Alarm Informations.
        Output parameter iter shall be useless.
        If flag is FALSE, no Alarm Informations shall be in AlarmInformationSeq.
        IRPAgent needs to use iter to retrieve them.
        */
       case 7:  // AlarmIRPSystem/AlarmIRP/get_alarm_list
       {
         try {
           ManagedGenericIRPConstDefs.StringTypeOpt filter = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           AlarmIRPConstDefs.DNTypeOpt base_object = AlarmIRPConstDefs.DNTypeOptHelper.read (in);
           org.omg.CORBA.BooleanHolder flag = new org.omg.CORBA.BooleanHolder ();
           AlarmIRPSystem.AlarmInformationIteratorHolder iter = new AlarmIRPSystem.AlarmInformationIteratorHolder ();
           CosNotification.StructuredEvent $result[] = null;
           $result = this.get_alarm_list (filter, base_object, flag, iter);
           out = $rh.createReply();
           CosNotification.EventBatchHelper.write (out, $result);
           out.write_boolean (flag.value);
           AlarmIRPSystem.AlarmInformationIteratorHelper.write (out, iter.value);
         } catch (AlarmIRPSystem.GetAlarmList $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.GetAlarmListHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.ParameterNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        This method returns the count of Alarm Informations.
        */
       case 8:  // AlarmIRPSystem/AlarmIRP/get_alarm_count
       {
         try {
           ManagedGenericIRPConstDefs.StringTypeOpt filter = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (in);
           org.omg.CORBA.IntHolder critical_count = new org.omg.CORBA.IntHolder ();
           org.omg.CORBA.IntHolder major_count = new org.omg.CORBA.IntHolder ();
           org.omg.CORBA.IntHolder minor_count = new org.omg.CORBA.IntHolder ();
           org.omg.CORBA.IntHolder warning_count = new org.omg.CORBA.IntHolder ();
           org.omg.CORBA.IntHolder indeterminate_count = new org.omg.CORBA.IntHolder ();
           org.omg.CORBA.IntHolder cleared_count = new org.omg.CORBA.IntHolder ();
           this.get_alarm_count (filter, critical_count, major_count, minor_count, warning_count, indeterminate_count, cleared_count);
           out = $rh.createReply();
           out.write_ulong (critical_count.value);
           out.write_ulong (major_count.value);
           out.write_ulong (minor_count.value);
           out.write_ulong (warning_count.value);
           out.write_ulong (indeterminate_count.value);
           out.write_ulong (cleared_count.value);
         } catch (AlarmIRPSystem.GetAlarmCount $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.GetAlarmCountHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
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
    "IDL:3gppsa5.org/AlarmIRPSystem/AlarmIRP:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public AlarmIRP _this() 
  {
    return AlarmIRPHelper.narrow(
    super._this_object());
  }

  public AlarmIRP _this(org.omg.CORBA.ORB orb) 
  {
    return AlarmIRPHelper.narrow(
    super._this_object(orb));
  }


} // class AlarmIRPPOA
