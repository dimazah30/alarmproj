package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/NotificationCategorySetHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   It defines the notification categories.
   A notification category is identified by the IRP name and its version number.
   */
abstract public class NotificationCategorySetHelper
{
  private static String  _id = "IDL:3gppsa5.org/NotificationIRPConstDefs/NotificationCategorySet:1.0";

  public static void insert (org.omg.CORBA.Any a, String[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ManagedGenericIRPConstDefs.VersionNumberHelper.id (), "VersionNumber", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ManagedGenericIRPConstDefs.VersionNumberSetHelper.id (), "VersionNumberSet", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (NotificationIRPConstDefs.NotificationCategorySetHelper.id (), "NotificationCategorySet", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String[] read (org.omg.CORBA.portable.InputStream istream)
  {
    String value[] = null;
    value = ManagedGenericIRPConstDefs.VersionNumberSetHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String[] value)
  {
    ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (ostream, value);
  }

}
