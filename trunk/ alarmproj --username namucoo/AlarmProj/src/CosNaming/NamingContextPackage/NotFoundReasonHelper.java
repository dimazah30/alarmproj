package CosNaming.NamingContextPackage;


/**
* CosNaming/NamingContextPackage/NotFoundReasonHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

abstract public class NotFoundReasonHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContext/NotFoundReason:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNaming.NamingContextPackage.NotFoundReason that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNaming.NamingContextPackage.NotFoundReason extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (CosNaming.NamingContextPackage.NotFoundReasonHelper.id (), "NotFoundReason", new String[] { "missing_node", "not_context", "not_object"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNaming.NamingContextPackage.NotFoundReason read (org.omg.CORBA.portable.InputStream istream)
  {
    return CosNaming.NamingContextPackage.NotFoundReason.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNaming.NamingContextPackage.NotFoundReason value)
  {
    ostream.write_long (value.value ());
  }

}
