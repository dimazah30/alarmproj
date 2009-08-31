package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdInfoTypeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

abstract public class ThresholdInfoTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/ThresholdInfoType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.ThresholdInfoType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.ThresholdInfoType extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "attributeID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_float);
          _members0[1] = new org.omg.CORBA.StructMember (
            "observedValue",
            _tcOf_members0,
            null);
          _tcOf_members0 = AlarmIRPConstDefs.ThresholdLevelIndTypeOptHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "thresholdLevel",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "armTime",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (AlarmIRPConstDefs.ThresholdInfoTypeHelper.id (), "ThresholdInfoType", _members0);
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

  public static AlarmIRPConstDefs.ThresholdInfoType read (org.omg.CORBA.portable.InputStream istream)
  {
    AlarmIRPConstDefs.ThresholdInfoType value = new AlarmIRPConstDefs.ThresholdInfoType ();
    value.attributeID = istream.read_string ();
    value.observedValue = istream.read_float ();
    value.thresholdLevel = AlarmIRPConstDefs.ThresholdLevelIndTypeOptHelper.read (istream);
    value.armTime = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.ThresholdInfoType value)
  {
    ostream.write_string (value.attributeID);
    ostream.write_float (value.observedValue);
    AlarmIRPConstDefs.ThresholdLevelIndTypeOptHelper.write (ostream, value.thresholdLevel);
    ostream.write_string (value.armTime);
  }

}
