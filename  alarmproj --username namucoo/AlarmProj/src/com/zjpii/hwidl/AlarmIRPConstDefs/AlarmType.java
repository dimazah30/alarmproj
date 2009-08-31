package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the alarm types specified for this IRP version.
   These types carry the same semantics as the TMN ITU-T defined event
   types of the same name.
   Their encodings for this version of Alarm IRP are defined here.  Other IRP
   documents, or other versions of Alarm IRP, shall identify their own
   alarm types for their use.  They shall define their encodings
   as well.  Values defined here are unique among themselves.
   */
public interface AlarmType extends AlarmTypeOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final String COMMUNICATIONS_ALARM = "x1";
  public static final String PROCESSING_ERROR_ALARM = "x2";
  public static final String ENVIRONMENTAL_ALARM = "x3";
  public static final String QUALITY_OF_SERVICE_ALARM = "x4";
  public static final String EQUIPMENT_ALARM = "x5";
  public static final String INTEGRITY_VIOLATION = "x6";
  public static final String OPERATIONAL_VIOLATION = "x7";
  public static final String PHYSICAL_VIOLATION = "x8";
  public static final String SECURITY_SERVICE_OR_MECHANISM_VIOLATION = "x9";
  public static final String TIME_DOMAIN_VIOLATION = "x10";
} // interface AlarmType
