package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AcknowledgeFailureCategoriesHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates the reason for an alarm acknowledgement to have failed:
     - The specified Alarm Information is absent from the Alarm List
     - The Perceived Severity to be acknowledged has changed and/or is different
       within the Alarm List
     - The acknowledgement failed for some other reason
   */
abstract public class AcknowledgeFailureCategoriesHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AcknowledgeFailureCategories:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.AcknowledgeFailureCategories that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.AcknowledgeFailureCategories extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (AlarmIRPConstDefs.AcknowledgeFailureCategoriesHelper.id (), "AcknowledgeFailureCategories", new String[] { "UnknownAlarmId", "WrongPerceivedSeverity", "AcknowledgmentFailed"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.AcknowledgeFailureCategories read (org.omg.CORBA.portable.InputStream istream)
  {
    return AlarmIRPConstDefs.AcknowledgeFailureCategories.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.AcknowledgeFailureCategories value)
  {
    ostream.write_long (value.value ());
  }

}
