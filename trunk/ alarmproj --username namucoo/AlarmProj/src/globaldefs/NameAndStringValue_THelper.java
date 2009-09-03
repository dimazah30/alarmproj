package globaldefs;


/**
* globaldefs/NameAndStringValue_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/

abstract public class NameAndStringValue_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/globaldefs/NameAndStringValue_T:1.0";

  public static void insert (org.omg.CORBA.Any a, globaldefs.NameAndStringValue_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static globaldefs.NameAndStringValue_T extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (globaldefs.NameAndStringValue_THelper.id (), "NameAndStringValue_T", _members0);
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

  public static globaldefs.NameAndStringValue_T read (org.omg.CORBA.portable.InputStream istream)
  {
    globaldefs.NameAndStringValue_T value = new globaldefs.NameAndStringValue_T ();
    value.name = istream.read_string ();
    value.value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, globaldefs.NameAndStringValue_T value)
  {
    ostream.write_string (value.name);
    ostream.write_string (value.value);
  }

}
