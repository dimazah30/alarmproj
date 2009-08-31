package CosNotification;


/**
* CosNotification/PropertyValueHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

abstract public class PropertyValueHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/PropertyValue:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.Any that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.Any extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_any);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.PropertyValueHelper.id (), "PropertyValue", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.Any read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.CORBA.Any value = null;
    value = istream.read_any ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.Any value)
  {
    ostream.write_any (value);
  }

}
