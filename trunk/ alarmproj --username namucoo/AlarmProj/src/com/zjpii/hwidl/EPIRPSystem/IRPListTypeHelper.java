package EPIRPSystem;


/**
* EPIRPSystem/IRPListTypeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/


/*
   List of all IRPElement and their associated parameters.
  */
abstract public class IRPListTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/EPIRPSystem/IRPListType:1.0";

  public static void insert (org.omg.CORBA.Any a, EPIRPSystem.IRPElement[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EPIRPSystem.IRPElement[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = EPIRPSystem.IRPElementHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (EPIRPSystem.IRPListTypeHelper.id (), "IRPListType", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EPIRPSystem.IRPElement[] read (org.omg.CORBA.portable.InputStream istream)
  {
    EPIRPSystem.IRPElement value[] = null;
    int _len0 = istream.read_long ();
    value = new EPIRPSystem.IRPElement[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = EPIRPSystem.IRPElementHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EPIRPSystem.IRPElement[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      EPIRPSystem.IRPElementHelper.write (ostream, value[_i0]);
  }

}
