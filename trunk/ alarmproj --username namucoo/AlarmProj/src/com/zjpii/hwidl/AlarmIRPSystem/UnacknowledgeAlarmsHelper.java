package AlarmIRPSystem;


/**
* AlarmIRPSystem/UnacknowledgeAlarmsHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

abstract public class UnacknowledgeAlarmsHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPSystem/UnacknowledgeAlarms:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPSystem.UnacknowledgeAlarms that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPSystem.UnacknowledgeAlarms extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "reason",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (AlarmIRPSystem.UnacknowledgeAlarmsHelper.id (), "UnacknowledgeAlarms", _members0);
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

  public static AlarmIRPSystem.UnacknowledgeAlarms read (org.omg.CORBA.portable.InputStream istream)
  {
    AlarmIRPSystem.UnacknowledgeAlarms value = new AlarmIRPSystem.UnacknowledgeAlarms ();
    // read and discard the repository ID
    istream.read_string ();
    value.reason = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPSystem.UnacknowledgeAlarms value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.reason);
  }

}
