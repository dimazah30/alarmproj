package AlarmIRPSystem;


/**
* AlarmIRPSystem/_AlarmIRPStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public class _AlarmIRPStub extends org.omg.CORBA.portable.ObjectImpl implements AlarmIRPSystem.AlarmIRP
{


  /*
        Return the list of all supported Alarm IRP versions.
        Implementations are to provide a return value consisting of one or more
        IRPVersions.
        Each IRPVersion is defined by the rule in the clause titled
        "IRP document version number string"
        */
  public String[] get_alarm_IRP_versions () throws AlarmIRPSystem.GetAlarmIRPVersions
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_IRP_versions", true);
                $in = _invoke ($out);
                String $result[] = ManagedGenericIRPConstDefs.VersionNumberSetHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmIRPVersions:1.0"))
                    throw AlarmIRPSystem.GetAlarmIRPVersionsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_IRP_versions (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_IRP_versions


  /*
        Return the list of all supported operations and their supported
        parameters for a specific Alarm IRP version.
        */
  public ManagedGenericIRPConstDefs.Method[] get_alarm_IRP_operations_profile (String alarm_irp_version) throws AlarmIRPSystem.GetAlarmIRPOperationsProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_IRP_operations_profile", true);
                ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, alarm_irp_version);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Method $result[] = ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmIRPOperationsProfile:1.0"))
                    throw AlarmIRPSystem.GetAlarmIRPOperationsProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_IRP_operations_profile (alarm_irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_IRP_operations_profile


  /*
        Return the list of all supported notifications and their supported
        parameters for a specific Alarm IRP version.
        */
  public ManagedGenericIRPConstDefs.Method[] get_alarm_IRP_notification_profile (String alarm_irp_version) throws AlarmIRPSystem.GetAlarmIRPNotificationProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_IRP_notification_profile", true);
                ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, alarm_irp_version);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Method $result[] = ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmIRPNotificationProfile:1.0"))
                    throw AlarmIRPSystem.GetAlarmIRPNotificationProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_IRP_notification_profile (alarm_irp_version        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_IRP_notification_profile


  /*
        Request to acknowledge one or more alarms.
        */
  public ManagedGenericIRPConstDefs.Signal acknowledge_alarms (AlarmIRPConstDefs.AlarmInformationIdAndSev[] alarm_information_id_and_sev_list, String ack_user_id, ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id, AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHolder bad_ack_alarm_info_list) throws AlarmIRPSystem.AcknowledgeAlarms, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("acknowledge_alarms", true);
                AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.write ($out, alarm_information_id_and_sev_list);
                $out.write_string (ack_user_id);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, ack_system_id);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Signal $result = ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_ack_alarm_info_list.value = AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/AcknowledgeAlarms:1.0"))
                    throw AlarmIRPSystem.AcknowledgeAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return acknowledge_alarms (alarm_information_id_and_sev_list, ack_user_id, ack_system_id, bad_ack_alarm_info_list        );
            } finally {
                _releaseReply ($in);
            }
  } // acknowledge_alarms


  /*
        Request to remove acknowledgement information of one or more alarms.
        */
  public ManagedGenericIRPConstDefs.Signal unacknowledge_alarms (String[] alarm_information_id_list, String ack_user_id, ManagedGenericIRPConstDefs.StringTypeOpt ack_system_id, AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws AlarmIRPSystem.UnacknowledgeAlarms, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("unacknowledge_alarms", true);
                AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write ($out, alarm_information_id_list);
                $out.write_string (ack_user_id);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, ack_system_id);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Signal $result = ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_alarm_information_id_list.value = AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/UnacknowledgeAlarms:1.0"))
                    throw AlarmIRPSystem.UnacknowledgeAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return unacknowledge_alarms (alarm_information_id_list, ack_user_id, ack_system_id, bad_alarm_information_id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // unacknowledge_alarms


  /*
        Make comment to one or more alarms.
        */
  public ManagedGenericIRPConstDefs.Signal comment_alarms (String[] alarm_information_id_list, String comment_user_id, ManagedGenericIRPConstDefs.StringTypeOpt comment_system_id, String comment_text, AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws AlarmIRPSystem.CommentAlarms, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("comment_alarms", true);
                AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write ($out, alarm_information_id_list);
                $out.write_string (comment_user_id);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, comment_system_id);
                $out.write_string (comment_text);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Signal $result = ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_alarm_information_id_list.value = AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/CommentAlarms:1.0"))
                    throw AlarmIRPSystem.CommentAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return comment_alarms (alarm_information_id_list, comment_user_id, comment_system_id, comment_text, bad_alarm_information_id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // comment_alarms


  /*
        Request to clear one or more alarms.
        */
  public ManagedGenericIRPConstDefs.Signal clear_alarms (String[] alarm_information_id_list, String clear_user_id, ManagedGenericIRPConstDefs.StringTypeOpt clear_system_id, AlarmIRPConstDefs.BadAlarmInformationIdSeqHolder bad_alarm_information_id_list) throws AlarmIRPSystem.ClearAlarms, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("clear_alarms", true);
                AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write ($out, alarm_information_id_list);
                $out.write_string (clear_user_id);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, clear_system_id);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Signal $result = ManagedGenericIRPConstDefs.SignalHelper.read ($in);
                bad_alarm_information_id_list.value = AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/ClearAlarms:1.0"))
                    throw AlarmIRPSystem.ClearAlarmsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return clear_alarms (alarm_information_id_list, clear_user_id, clear_system_id, bad_alarm_information_id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // clear_alarms


  /*
        This method returns Alarm Informations.
        If flag is TRUE, all returned Alarm Informations shall be
        in AlarmInformationSeq that contains 0 or more Alarm Informations.
        Output parameter iter shall be useless.
        If flag is FALSE, no Alarm Informations shall be in AlarmInformationSeq.
        IRPAgent needs to use iter to retrieve them.
        */
  public CosNotification.StructuredEvent[] get_alarm_list (ManagedGenericIRPConstDefs.StringTypeOpt filter, AlarmIRPConstDefs.DNTypeOpt base_object, org.omg.CORBA.BooleanHolder flag, AlarmIRPSystem.AlarmInformationIteratorHolder iter) throws AlarmIRPSystem.GetAlarmList, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_list", true);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, filter);
                AlarmIRPConstDefs.DNTypeOptHelper.write ($out, base_object);
                $in = _invoke ($out);
                CosNotification.StructuredEvent $result[] = AlarmIRPConstDefs.AlarmInformationSeqHelper.read ($in);
                flag.value = $in.read_boolean ();
                iter.value = AlarmIRPSystem.AlarmInformationIteratorHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmList:1.0"))
                    throw AlarmIRPSystem.GetAlarmListHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_alarm_list (filter, base_object, flag, iter        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_list


  /*
        This method returns the count of Alarm Informations.
        */
  public void get_alarm_count (ManagedGenericIRPConstDefs.StringTypeOpt filter, org.omg.CORBA.IntHolder critical_count, org.omg.CORBA.IntHolder major_count, org.omg.CORBA.IntHolder minor_count, org.omg.CORBA.IntHolder warning_count, org.omg.CORBA.IntHolder indeterminate_count, org.omg.CORBA.IntHolder cleared_count) throws AlarmIRPSystem.GetAlarmCount, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.ParameterNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_alarm_count", true);
                ManagedGenericIRPConstDefs.StringTypeOptHelper.write ($out, filter);
                $in = _invoke ($out);
                critical_count.value = $in.read_ulong ();
                major_count.value = $in.read_ulong ();
                minor_count.value = $in.read_ulong ();
                warning_count.value = $in.read_ulong ();
                indeterminate_count.value = $in.read_ulong ();
                cleared_count.value = $in.read_ulong ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/GetAlarmCount:1.0"))
                    throw AlarmIRPSystem.GetAlarmCountHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/ParameterNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.ParameterNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                get_alarm_count (filter, critical_count, major_count, minor_count, warning_count, indeterminate_count, cleared_count        );
            } finally {
                _releaseReply ($in);
            }
  } // get_alarm_count

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/AlarmIRPSystem/AlarmIRP:1.0"};

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
} // class _AlarmIRPStub
