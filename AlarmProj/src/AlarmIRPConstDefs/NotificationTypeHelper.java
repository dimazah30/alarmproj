package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/NotificationTypeHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the notification types defined by this
   Alarm IRP version.
   */
abstract public class NotificationTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/NotificationType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.NotificationType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.NotificationType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AlarmIRPConstDefs.NotificationTypeHelper.id (), "NotificationType");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.NotificationType read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NotificationTypeStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.NotificationType value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AlarmIRPConstDefs.NotificationType narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.NotificationType)
      return (AlarmIRPConstDefs.NotificationType)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._NotificationTypeStub stub = new AlarmIRPConstDefs._NotificationTypeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AlarmIRPConstDefs.NotificationType unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.NotificationType)
      return (AlarmIRPConstDefs.NotificationType)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._NotificationTypeStub stub = new AlarmIRPConstDefs._NotificationTypeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
