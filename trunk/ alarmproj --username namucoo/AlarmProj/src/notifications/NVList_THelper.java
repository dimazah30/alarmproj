package notifications;


/**
* notifications/NVList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>A list of (name=string, value=any) tuples. The OMG standard 
   * NVList.  This is used for AttributeValueChange and StateChange 
   * notifications (see <a
   * href=../../../supportingDocumentation/SD1-26_OMGServicesUsage.pdf >SD1-26  
   * Guidelines for Using the OMG Notification and Telecom Log Service</a>).</p>
   **/
abstract public class NVList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/NVList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.NameAndAnyValue_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.NameAndAnyValue_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = notifications.NameAndAnyValue_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (notifications.NVList_THelper.id (), "NVList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.NameAndAnyValue_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    notifications.NameAndAnyValue_T value[] = null;
    int _len0 = istream.read_long ();
    value = new notifications.NameAndAnyValue_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = notifications.NameAndAnyValue_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.NameAndAnyValue_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      notifications.NameAndAnyValue_THelper.write (ostream, value[_i0]);
  }

}
