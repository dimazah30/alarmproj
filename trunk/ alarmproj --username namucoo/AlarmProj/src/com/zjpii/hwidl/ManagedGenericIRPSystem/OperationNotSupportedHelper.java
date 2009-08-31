package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/OperationNotSupportedHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分17秒 CST
*/


/*
   Exception thrown when an unsupported optional method is called.
   */
abstract public class OperationNotSupportedHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0";

  public static void insert (org.omg.CORBA.Any a, ManagedGenericIRPSystem.OperationNotSupported that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ManagedGenericIRPSystem.OperationNotSupported extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (ManagedGenericIRPSystem.OperationNotSupportedHelper.id (), "OperationNotSupported", _members0);
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

  public static ManagedGenericIRPSystem.OperationNotSupported read (org.omg.CORBA.portable.InputStream istream)
  {
    ManagedGenericIRPSystem.OperationNotSupported value = new ManagedGenericIRPSystem.OperationNotSupported ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ManagedGenericIRPSystem.OperationNotSupported value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
