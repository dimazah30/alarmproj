package notifications;


/**
* notifications/ObjectTypeQualifier_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>The ObjectTypeQualifier_T is used to identify object types defined
   * in v3.0 and beyond. It is needed because the ObjectType_T enum cannot be 
   * extended for backward compatibility reasons. </p>
   * 
   **/
abstract public class ObjectTypeQualifier_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/ObjectTypeQualifier_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (notifications.ObjectTypeQualifier_THelper.id (), "ObjectTypeQualifier_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_string (value);
  }

}
