package notifications;


/**
* notifications/ObjectType_THelper.java .
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
abstract public class ObjectType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/ObjectType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.ObjectType_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.ObjectType_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (notifications.ObjectType_THelper.id (), "ObjectType_T", new String[] { "OT_EMS", "OT_MANAGED_ELEMENT", "OT_MULTILAYER_SUBNETWORK", "OT_TOPOLOGICAL_LINK", "OT_SUBNETWORK_CONNECTION", "OT_PHYSICAL_TERMINATION_POINT", "OT_CONNECTION_TERMINATION_POINT", "OT_TERMINATION_POINT_POOL", "OT_EQUIPMENT_HOLDER", "OT_EQUIPMENT", "OT_PROTECTION_GROUP", "OT_TRAFFIC_DESCRIPTOR", "OT_AID"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.ObjectType_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return notifications.ObjectType_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.ObjectType_T value)
  {
    ostream.write_long (value.value ());
  }

}
