package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/MethodHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/

abstract public class MethodHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPConstDefs/Method:1.0";

  public static void insert (org.omg.CORBA.Any a, ManagedGenericIRPConstDefs.Method that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ManagedGenericIRPConstDefs.Method extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ManagedGenericIRPConstDefs.MethodNameHelper.id (), "MethodName", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ManagedGenericIRPConstDefs.ParameterNameHelper.id (), "ParameterName", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ManagedGenericIRPConstDefs.ParameterListHelper.id (), "ParameterList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "parameter_list",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ManagedGenericIRPConstDefs.MethodHelper.id (), "Method", _members0);
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

  public static ManagedGenericIRPConstDefs.Method read (org.omg.CORBA.portable.InputStream istream)
  {
    ManagedGenericIRPConstDefs.Method value = new ManagedGenericIRPConstDefs.Method ();
    value.name = istream.read_string ();
    value.parameter_list = ManagedGenericIRPConstDefs.ParameterListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ManagedGenericIRPConstDefs.Method value)
  {
    ostream.write_string (value.name);
    ManagedGenericIRPConstDefs.ParameterListHelper.write (ostream, value.parameter_list);
  }

}
