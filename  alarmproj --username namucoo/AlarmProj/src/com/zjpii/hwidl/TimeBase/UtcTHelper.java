package TimeBase;


/**
* TimeBase/UtcTHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 TimeBase.idl
* 2009年8月24日 星期一 上午09时36分53秒 CST
*/

abstract public class UtcTHelper
{
  private static String  _id = "IDL:omg.org/TimeBase/UtcT:1.0";

  public static void insert (org.omg.CORBA.Any a, TimeBase.UtcT that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static TimeBase.UtcT extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulonglong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (TimeBase.TimeTHelper.id (), "TimeT", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "time",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _members0[1] = new org.omg.CORBA.StructMember (
            "inacclo",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
          _members0[2] = new org.omg.CORBA.StructMember (
            "inacchi",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (TimeBase.TdfTHelper.id (), "TdfT", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "tdf",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (TimeBase.UtcTHelper.id (), "UtcT", _members0);
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

  public static TimeBase.UtcT read (org.omg.CORBA.portable.InputStream istream)
  {
    TimeBase.UtcT value = new TimeBase.UtcT ();
    value.time = istream.read_ulonglong ();
    value.inacclo = istream.read_ulong ();
    value.inacchi = istream.read_ushort ();
    value.tdf = istream.read_short ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, TimeBase.UtcT value)
  {
    ostream.write_ulonglong (value.time);
    ostream.write_ulong (value.inacclo);
    ostream.write_ushort (value.inacchi);
    ostream.write_short (value.tdf);
  }

}
