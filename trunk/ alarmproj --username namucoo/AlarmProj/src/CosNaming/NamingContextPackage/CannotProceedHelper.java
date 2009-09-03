package CosNaming.NamingContextPackage;


/**
* CosNaming/NamingContextPackage/CannotProceedHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

abstract public class CannotProceedHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNaming.NamingContextPackage.CannotProceed that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNaming.NamingContextPackage.CannotProceed extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = CosNaming.NamingContextHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "cxt",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosNaming.NameComponentHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNaming.NameHelper.id (), "Name", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "rest_of_name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (CosNaming.NamingContextPackage.CannotProceedHelper.id (), "CannotProceed", _members0);
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

  public static CosNaming.NamingContextPackage.CannotProceed read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNaming.NamingContextPackage.CannotProceed value = new CosNaming.NamingContextPackage.CannotProceed ();
    // read and discard the repository ID
    istream.read_string ();
    value.cxt = CosNaming.NamingContextHelper.read (istream);
    value.rest_of_name = CosNaming.NameHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNaming.NamingContextPackage.CannotProceed value)
  {
    // write the repository ID
    ostream.write_string (id ());
    CosNaming.NamingContextHelper.write (ostream, value.cxt);
    CosNaming.NameHelper.write (ostream, value.rest_of_name);
  }

}
