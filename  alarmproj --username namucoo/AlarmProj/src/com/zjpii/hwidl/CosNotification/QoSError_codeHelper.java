package CosNotification;


/**
* CosNotification/QoSError_codeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

abstract public class QoSError_codeHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/QoSError_code:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.QoSError_code that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.QoSError_code extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (CosNotification.QoSError_codeHelper.id (), "QoSError_code", new String[] { "UNSUPPORTED_PROPERTY", "UNAVAILABLE_PROPERTY", "UNSUPPORTED_VALUE", "UNAVAILABLE_VALUE", "BAD_PROPERTY", "BAD_TYPE", "BAD_VALUE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.QoSError_code read (org.omg.CORBA.portable.InputStream istream)
  {
    return CosNotification.QoSError_code.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.QoSError_code value)
  {
    ostream.write_long (value.value ());
  }

}
