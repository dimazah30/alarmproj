package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/InvalidParameterHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分17秒 CST
*/


/*
   Exception thrown when an invalid parameter value is passed.
   The parameter shall be the actual parameter name.
   */
abstract public class InvalidParameterHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0";

  public static void insert (org.omg.CORBA.Any a, ManagedGenericIRPSystem.InvalidParameter that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ManagedGenericIRPSystem.InvalidParameter extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "parameter",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (ManagedGenericIRPSystem.InvalidParameterHelper.id (), "InvalidParameter", _members0);
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

  public static ManagedGenericIRPSystem.InvalidParameter read (org.omg.CORBA.portable.InputStream istream)
  {
    ManagedGenericIRPSystem.InvalidParameter value = new ManagedGenericIRPSystem.InvalidParameter ();
    // read and discard the repository ID
    istream.read_string ();
    value.parameter = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ManagedGenericIRPSystem.InvalidParameter value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.parameter);
  }

}
