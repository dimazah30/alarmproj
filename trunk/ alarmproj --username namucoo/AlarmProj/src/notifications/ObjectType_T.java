package notifications;


/**
* notifications/ObjectType_T.java .
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
public class ObjectType_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 13;
  private static notifications.ObjectType_T[] __array = new notifications.ObjectType_T [__size];

  public static final int _OT_EMS = 0;
  public static final notifications.ObjectType_T OT_EMS = new notifications.ObjectType_T(_OT_EMS);
  public static final int _OT_MANAGED_ELEMENT = 1;
  public static final notifications.ObjectType_T OT_MANAGED_ELEMENT = new notifications.ObjectType_T(_OT_MANAGED_ELEMENT);
  public static final int _OT_MULTILAYER_SUBNETWORK = 2;
  public static final notifications.ObjectType_T OT_MULTILAYER_SUBNETWORK = new notifications.ObjectType_T(_OT_MULTILAYER_SUBNETWORK);
  public static final int _OT_TOPOLOGICAL_LINK = 3;
  public static final notifications.ObjectType_T OT_TOPOLOGICAL_LINK = new notifications.ObjectType_T(_OT_TOPOLOGICAL_LINK);
  public static final int _OT_SUBNETWORK_CONNECTION = 4;
  public static final notifications.ObjectType_T OT_SUBNETWORK_CONNECTION = new notifications.ObjectType_T(_OT_SUBNETWORK_CONNECTION);
  public static final int _OT_PHYSICAL_TERMINATION_POINT = 5;
  public static final notifications.ObjectType_T OT_PHYSICAL_TERMINATION_POINT = new notifications.ObjectType_T(_OT_PHYSICAL_TERMINATION_POINT);
  public static final int _OT_CONNECTION_TERMINATION_POINT = 6;
  public static final notifications.ObjectType_T OT_CONNECTION_TERMINATION_POINT = new notifications.ObjectType_T(_OT_CONNECTION_TERMINATION_POINT);
  public static final int _OT_TERMINATION_POINT_POOL = 7;
  public static final notifications.ObjectType_T OT_TERMINATION_POINT_POOL = new notifications.ObjectType_T(_OT_TERMINATION_POINT_POOL);
  public static final int _OT_EQUIPMENT_HOLDER = 8;
  public static final notifications.ObjectType_T OT_EQUIPMENT_HOLDER = new notifications.ObjectType_T(_OT_EQUIPMENT_HOLDER);
  public static final int _OT_EQUIPMENT = 9;
  public static final notifications.ObjectType_T OT_EQUIPMENT = new notifications.ObjectType_T(_OT_EQUIPMENT);
  public static final int _OT_PROTECTION_GROUP = 10;
  public static final notifications.ObjectType_T OT_PROTECTION_GROUP = new notifications.ObjectType_T(_OT_PROTECTION_GROUP);
  public static final int _OT_TRAFFIC_DESCRIPTOR = 11;
  public static final notifications.ObjectType_T OT_TRAFFIC_DESCRIPTOR = new notifications.ObjectType_T(_OT_TRAFFIC_DESCRIPTOR);
  public static final int _OT_AID = 12;
  public static final notifications.ObjectType_T OT_AID = new notifications.ObjectType_T(_OT_AID);

  public int value ()
  {
    return __value;
  }

  public static notifications.ObjectType_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ObjectType_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ObjectType_T
