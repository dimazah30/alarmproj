package EPIRPSystem;


/**
* EPIRPSystem/SupportedIRPListTypeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

abstract public class SupportedIRPListTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/EPIRPSystem/SupportedIRPListType:1.0";

  public static void insert (org.omg.CORBA.Any a, EPIRPSystem.SupportedIRPListTypeElement[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EPIRPSystem.SupportedIRPListTypeElement[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = EPIRPSystem.SupportedIRPListTypeElementHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (EPIRPSystem.SupportedIRPListTypeHelper.id (), "SupportedIRPListType", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EPIRPSystem.SupportedIRPListTypeElement[] read (org.omg.CORBA.portable.InputStream istream)
  {
    EPIRPSystem.SupportedIRPListTypeElement value[] = null;
    int _len0 = istream.read_long ();
    value = new EPIRPSystem.SupportedIRPListTypeElement[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = EPIRPSystem.SupportedIRPListTypeElementHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EPIRPSystem.SupportedIRPListTypeElement[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      EPIRPSystem.SupportedIRPListTypeElementHelper.write (ostream, value[_i0]);
  }

}
