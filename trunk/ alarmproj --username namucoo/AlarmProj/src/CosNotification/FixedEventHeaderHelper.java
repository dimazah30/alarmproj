package CosNotification;


/**
* CosNotification/FixedEventHeaderHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

abstract public class FixedEventHeaderHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/FixedEventHeader:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.FixedEventHeader that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.FixedEventHeader extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = CosNotification.EventTypeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "event_type",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "event_name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosNotification.FixedEventHeaderHelper.id (), "FixedEventHeader", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.FixedEventHeader read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotification.FixedEventHeader value = new CosNotification.FixedEventHeader ();
    value.event_type = CosNotification.EventTypeHelper.read (istream);
    value.event_name = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.FixedEventHeader value)
  {
    CosNotification.EventTypeHelper.write (ostream, value.event_type);
    ostream.write_string (value.event_name);
  }

}
