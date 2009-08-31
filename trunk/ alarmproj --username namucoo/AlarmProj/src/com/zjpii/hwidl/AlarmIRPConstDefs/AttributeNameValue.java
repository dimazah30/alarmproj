package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeNameValue.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies attributes which are included as part of the Alarm IRP
   These attribute values should not clash with those defined for the attributes
   of notification header (see IDL of Notification IRP).
   */
public interface AttributeNameValue extends AttributeNameValueOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final String ALARM_ID = "f";
  public static final String PROBABLE_CAUSE = "g";
  public static final String PERCEIVED_SEVERITY = "h";
  public static final String SPECIFIC_PROBLEM = "i";
  public static final String ADDITIONAL_TEXT = "j";
  public static final String ACK_TIME = "k";
  public static final String ACK_USER_ID = "l";
  public static final String ACK_SYSTEM_ID = "m";
  public static final String ACK_STATE = "n";
  public static final String COMMENTS = "o";
  public static final String BACKED_UP_STATUS = "p";
  public static final String BACK_UP_OBJECT = "q";
  public static final String THRESHOLD_INFO = "r";
  public static final String TREND_INDICATION = "s";
  public static final String STATE_CHANGE_DEFINITION = "t";
  public static final String MONITORED_ATTRIBUTES = "u";
  public static final String PROPOSED_REPAIR_ACTIONS = "v";
  public static final String CORRELATED_NOTIFICATIONS = "w";
  public static final String REASON = "x";
  public static final String CLEAR_USER_ID = "y";
  public static final String CLEAR_SYSTEM_ID = "z";
  public static final String ALARM_LIST_ALIGNMENT_REQUIREMENT = "ff";
  public static final String SERVICE_USER = "gg";
  public static final String SERVICE_PROVIDER = "hh";
  public static final String SECURITY_ALARM_DETECTOR = "ii";
  public static final String VENDOR_SPECIFIC_ALARM_TYPE = "jj";
  public static final String ALARM_RAISED_TIME = "kk";
  public static final String ALARM_CLEARED_TIME = "ll";
  public static final String ALARM_CHANGED_TIME = "mm";
} // interface AttributeNameValue
