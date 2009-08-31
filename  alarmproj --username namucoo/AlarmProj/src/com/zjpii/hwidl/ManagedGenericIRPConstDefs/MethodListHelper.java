package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/MethodListHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/


/*
   List of all methods and their associated parameters.
   */
abstract public class MethodListHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPConstDefs/MethodList:1.0";

  public static void insert (org.omg.CORBA.Any a, ManagedGenericIRPConstDefs.Method[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ManagedGenericIRPConstDefs.Method[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ManagedGenericIRPConstDefs.MethodHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ManagedGenericIRPConstDefs.MethodListHelper.id (), "MethodList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ManagedGenericIRPConstDefs.Method[] read (org.omg.CORBA.portable.InputStream istream)
  {
    ManagedGenericIRPConstDefs.Method value[] = null;
    int _len0 = istream.read_long ();
    value = new ManagedGenericIRPConstDefs.Method[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = ManagedGenericIRPConstDefs.MethodHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ManagedGenericIRPConstDefs.Method[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ManagedGenericIRPConstDefs.MethodHelper.write (ostream, value[_i0]);
  }

}
