package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/BackedUpStatusTypeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates if an object has a back up.
   True implies backed up.  False implies not backed up.
   */
abstract public class BackedUpStatusTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/BackedUpStatusType:1.0";

  public static void insert (org.omg.CORBA.Any a, boolean that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static boolean extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (AlarmIRPConstDefs.BackedUpStatusTypeHelper.id (), "BackedUpStatusType", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static boolean read (org.omg.CORBA.portable.InputStream istream)
  {
    boolean value = false;
    value = istream.read_boolean ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, boolean value)
  {
    ostream.write_boolean (value);
  }

}
