package CosNotification;


/**
* CosNotification/OptionalHeaderFieldsHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/


// The following are the same, but serve different purposes.
abstract public class OptionalHeaderFieldsHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/OptionalHeaderFields:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.Property[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.Property[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = CosNotification.PropertyHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.PropertySeqHelper.id (), "PropertySeq", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.OptionalHeaderFieldsHelper.id (), "OptionalHeaderFields", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.Property[] read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotification.Property value[] = null;
    value = CosNotification.PropertySeqHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.Property[] value)
  {
    CosNotification.PropertySeqHelper.write (ostream, value);
  }

}
