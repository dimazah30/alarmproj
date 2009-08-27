package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintNotFoundHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

abstract public class ConstraintNotFoundHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyFilter.ConstraintNotFound that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyFilter.ConstraintNotFound extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotifyFilter.ConstraintIDHelper.id (), "ConstraintID", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (CosNotifyFilter.ConstraintNotFoundHelper.id (), "ConstraintNotFound", _members0);
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

  public static CosNotifyFilter.ConstraintNotFound read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotifyFilter.ConstraintNotFound value = new CosNotifyFilter.ConstraintNotFound ();
    // read and discard the repository ID
    istream.read_string ();
    value.id = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyFilter.ConstraintNotFound value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_long (value.id);
  }

}
