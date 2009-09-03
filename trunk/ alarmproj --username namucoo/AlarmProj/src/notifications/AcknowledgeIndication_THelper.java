package notifications;


/**
* notifications/AcknowledgeIndication_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>AcknowledgeIndication_T describes the event acknowledge state.</p> 
   * <br>AI_EVENT_ACKNOWLEDGED - provided in case of manual or auto 
   * acknowledgement<br>
   * <br>AI_EVENT_UNACKNOWLEDGED - provided if the event has not been 
   * acknowledged but the EMS supports acknowledgement for this event
   * or in the case that the alarm has been previously acknowledged and
   * then unacknowledged<br>
   * <br>AI_NA provided in case the EMS does not support acknowledgement for 
   * this event or does not support acknowledgement at all<br>
   **/
abstract public class AcknowledgeIndication_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/AcknowledgeIndication_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.AcknowledgeIndication_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.AcknowledgeIndication_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (notifications.AcknowledgeIndication_THelper.id (), "AcknowledgeIndication_T", new String[] { "AI_EVENT_ACKNOWLEDGED", "AI_EVENT_UNACKNOWLEDGED", "AI_NA"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.AcknowledgeIndication_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return notifications.AcknowledgeIndication_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.AcknowledgeIndication_T value)
  {
    ostream.write_long (value.value ());
  }

}
