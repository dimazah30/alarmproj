package NotificationIRPSystem;


/**
* NotificationIRPSystem/AlreadySubscribedHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPSystem.idl
* 2009��8��26�� ������ ����10ʱ44��59�� CST
*/

abstract public class AlreadySubscribedHelper
{
  private static String  _id = "IDL:3gppsa5.org/NotificationIRPSystem/AlreadySubscribed:1.0";

  public static void insert (org.omg.CORBA.Any a, NotificationIRPSystem.AlreadySubscribed that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NotificationIRPSystem.AlreadySubscribed extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (NotificationIRPSystem.AlreadySubscribedHelper.id (), "AlreadySubscribed", _members0);
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

  public static NotificationIRPSystem.AlreadySubscribed read (org.omg.CORBA.portable.InputStream istream)
  {
    NotificationIRPSystem.AlreadySubscribed value = new NotificationIRPSystem.AlreadySubscribed ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NotificationIRPSystem.AlreadySubscribed value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}