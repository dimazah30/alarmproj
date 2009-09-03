package notifications;

/**
* notifications/ObjectType_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>"OobjectType" is a filterable field attribute of all notifications,
   * except NT_PROTECTION_SWITCH, NT_EPROTECTION_SWITCH,
   * NT_FILE_TRANSFER_STATUS, NT_PM_SC, and NT_BACKUP_STATUS.
   * The enum avoids any uncertainty in the type of object and allows
   * and allows simple filtering.</p>
   *
   * <p>A notification must be reported against the correct object
   * if it this object is modelled.</p> 
   *
   * <p>For alarms, the objectType OT_AID (Alarm Identifier) is used
   * to represent the EMS object types that are not modelled
   * but can emit alarms.  Other notifications types
   * should not be reported against AIDs. This objectType value is also used for
   * new object types from release 3.0 onwards in order to guarantee
   * backward compatibility of the interface.</p>
   *
   * <p>Due to the requirement of strict backward compatibility
   * the release 2 enum ObjectType_T cannot be extended to include
   * new object types.  Therefore OT_AID is used as an "escape value"
   * for the field "objectType".  Thus OT_AID may also represent
   * new object types.  To identify which object type applies,
   * the new filterable field "objectTypeQualifier" is introduced
   * which is of type string and whose values are as follows:</p>
   * <br>"" - indicates an AID<br>
   * <br>"OT_EPROTECTION_GROUP" - equipment protection group<br>
   * <br>"OT_TCA_PARAMETER_PROFILE" - TCA parameter profile<br>
   * <br>"OT_PMP" - performance monitoring point<br>
   * <br>"OT_GTP" - group TP<br>
   * <br>"OT_ASAP" - alarm severity assignment profile<br>
   * <br>"OT_TRANSMISSION_DESCRIPTOR" - transmission descriptor<br>
   * <br>"OT_CALL" - Call <br>
   * <br>"OT_MULTILAYER_ROUTING_AREA" - multi-layer routing area <br>
   * <br>"OT_MULTILAYER_SNPP" - multi-layer subnetwork point pool <br>
   * <br>"OT_MULTILAYER_SNPPLINK" - multi-layer subnetwork point pool link <br>
   * <br>"OT_CONNECTION" - connection <br>
   * <br>"OT_FLOW_DOMAIN" - flow domain <br>
   * <br>"OT_FLOW_DOMAIN_FRAGMENT" - flow domain fragment <br>
   * <br>"OT_MATRIX_FLOW_DOMAIN" - matrix flow domain<br>
   * <br>"OT_MATRIX_FLOW_DOMAIN_FRAGMENT" - matrix flow domain fragment <br>
   * <br>"OT_TRAFFIC_CONDITIONING_PROFILE" - traffic conditioning profile <br>
   * <br>"OT_SNP" - subnetwork point <br>
   * <br>"OT_SNPP" - subnetwork point pool <br>
   * <p>If "objectTypeQualifier" is not present but "objectType"
   * has the value OT_AID we are dealing with a proper AID.</p>
   **/
public final class ObjectType_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.ObjectType_T value = null;

  public ObjectType_THolder ()
  {
  }

  public ObjectType_THolder (notifications.ObjectType_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.ObjectType_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.ObjectType_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.ObjectType_THelper.type ();
  }

}
