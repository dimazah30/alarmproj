package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationIdAndSevHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

abstract public class AlarmInformationIdAndSevHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AlarmInformationIdAndSev:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.AlarmInformationIdAndSev that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.AlarmInformationIdAndSev extract (org.omg.CORBA.Any a)
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
            "alarm_information_reference",
            _tcOf_members0,
            null);
          _tcOf_members0 = ManagedGenericIRPConstDefs.ShortTypeOptHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "perceived_severity",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (AlarmIRPConstDefs.AlarmInformationIdAndSevHelper.id (), "AlarmInformationIdAndSev", _members0);
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

  public static AlarmIRPConstDefs.AlarmInformationIdAndSev read (org.omg.CORBA.portable.InputStream istream)
  {
    AlarmIRPConstDefs.AlarmInformationIdAndSev value = new AlarmIRPConstDefs.AlarmInformationIdAndSev ();
    value.alarm_information_reference = istream.read_string ();
    value.perceived_severity = ManagedGenericIRPConstDefs.ShortTypeOptHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.AlarmInformationIdAndSev value)
  {
    ostream.write_string (value.alarm_information_reference);
    ManagedGenericIRPConstDefs.ShortTypeOptHelper.write (ostream, value.perceived_severity);
  }

}
