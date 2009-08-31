package EPIRPSystem;


/**
* EPIRPSystem/SupportedIRPListTypeElementHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

abstract public class SupportedIRPListTypeElementHelper
{
  private static String  _id = "IDL:3gppsa5.org/EPIRPSystem/SupportedIRPListTypeElement:1.0";

  public static void insert (org.omg.CORBA.Any a, EPIRPSystem.SupportedIRPListTypeElement that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EPIRPSystem.SupportedIRPListTypeElement extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (EPIRPSystem.SystemDNTypeHelper.id (), "SystemDNType", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "systemDN",
            _tcOf_members0,
            null);
          _tcOf_members0 = EPIRPSystem.IRPElementHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (EPIRPSystem.IRPListTypeHelper.id (), "IRPListType", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "irpList",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (EPIRPSystem.SupportedIRPListTypeElementHelper.id (), "SupportedIRPListTypeElement", _members0);
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

  public static EPIRPSystem.SupportedIRPListTypeElement read (org.omg.CORBA.portable.InputStream istream)
  {
    EPIRPSystem.SupportedIRPListTypeElement value = new EPIRPSystem.SupportedIRPListTypeElement ();
    value.systemDN = istream.read_string ();
    value.irpList = EPIRPSystem.IRPListTypeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EPIRPSystem.SupportedIRPListTypeElement value)
  {
    ostream.write_string (value.systemDN);
    EPIRPSystem.IRPListTypeHelper.write (ostream, value.irpList);
  }

}
