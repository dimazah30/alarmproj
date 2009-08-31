package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/SubscriptionStateHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   This indicates if the subscription is Active (not suspended), Suspended,
   or Invalid.
   */
abstract public class SubscriptionStateHelper
{
  private static String  _id = "IDL:3gppsa5.org/NotificationIRPConstDefs/SubscriptionState:1.0";

  public static void insert (org.omg.CORBA.Any a, NotificationIRPConstDefs.SubscriptionState that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NotificationIRPConstDefs.SubscriptionState extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (NotificationIRPConstDefs.SubscriptionStateHelper.id (), "SubscriptionState", new String[] { "Active", "Suspended", "Invalid"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NotificationIRPConstDefs.SubscriptionState read (org.omg.CORBA.portable.InputStream istream)
  {
    return NotificationIRPConstDefs.SubscriptionState.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NotificationIRPConstDefs.SubscriptionState value)
  {
    ostream.write_long (value.value ());
  }

}
