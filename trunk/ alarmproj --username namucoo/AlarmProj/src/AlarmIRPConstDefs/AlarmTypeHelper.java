package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmTypeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the alarm types specified for this IRP version.
   These types carry the same semantics as the TMN ITU-T defined event
   types of the same name.
   Their encodings for this version of Alarm IRP are defined here.  Other IRP
   documents, or other versions of Alarm IRP, shall identify their own
   alarm types for their use.  They shall define their encodings
   as well.  Values defined here are unique among themselves.
   */
abstract public class AlarmTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AlarmType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.AlarmType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.AlarmType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AlarmIRPConstDefs.AlarmTypeHelper.id (), "AlarmType");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.AlarmType read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AlarmTypeStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.AlarmType value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AlarmIRPConstDefs.AlarmType narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.AlarmType)
      return (AlarmIRPConstDefs.AlarmType)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._AlarmTypeStub stub = new AlarmIRPConstDefs._AlarmTypeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AlarmIRPConstDefs.AlarmType unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.AlarmType)
      return (AlarmIRPConstDefs.AlarmType)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._AlarmTypeStub stub = new AlarmIRPConstDefs._AlarmTypeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
