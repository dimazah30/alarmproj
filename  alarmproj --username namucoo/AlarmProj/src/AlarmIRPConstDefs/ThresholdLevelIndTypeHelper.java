package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdLevelIndTypeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

abstract public class ThresholdLevelIndTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/ThresholdLevelIndType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.ThresholdLevelIndType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.ThresholdLevelIndType extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = AlarmIRPConstDefs.ThresholdIndicationTypeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "indication",
            _tcOf_members0,
            null);
          _tcOf_members0 = AlarmIRPConstDefs.FloatTypeOptHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "low",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_float);
          _members0[2] = new org.omg.CORBA.StructMember (
            "high",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (AlarmIRPConstDefs.ThresholdLevelIndTypeHelper.id (), "ThresholdLevelIndType", _members0);
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

  public static AlarmIRPConstDefs.ThresholdLevelIndType read (org.omg.CORBA.portable.InputStream istream)
  {
    AlarmIRPConstDefs.ThresholdLevelIndType value = new AlarmIRPConstDefs.ThresholdLevelIndType ();
    value.indication = AlarmIRPConstDefs.ThresholdIndicationTypeHelper.read (istream);
    value.low = AlarmIRPConstDefs.FloatTypeOptHelper.read (istream);
    value.high = istream.read_float ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.ThresholdLevelIndType value)
  {
    AlarmIRPConstDefs.ThresholdIndicationTypeHelper.write (ostream, value.indication);
    AlarmIRPConstDefs.FloatTypeOptHelper.write (ostream, value.low);
    ostream.write_float (value.high);
  }

}
