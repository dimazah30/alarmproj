package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/CorelatedNotificationHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

abstract public class CorelatedNotificationHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/CorelatedNotification:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.CorelatedNotification that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.CorelatedNotification extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (AlarmIRPConstDefs.DNHelper.id (), "DN", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "source",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (AlarmIRPConstDefs.NotifIdSetTypeHelper.id (), "NotifIdSetType", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "notif_id_set",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (AlarmIRPConstDefs.CorelatedNotificationHelper.id (), "CorelatedNotification", _members0);
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

  public static AlarmIRPConstDefs.CorelatedNotification read (org.omg.CORBA.portable.InputStream istream)
  {
    AlarmIRPConstDefs.CorelatedNotification value = new AlarmIRPConstDefs.CorelatedNotification ();
    value.source = istream.read_string ();
    value.notif_id_set = AlarmIRPConstDefs.NotifIdSetTypeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.CorelatedNotification value)
  {
    ostream.write_string (value.source);
    AlarmIRPConstDefs.NotifIdSetTypeHelper.write (ostream, value.notif_id_set);
  }

}
