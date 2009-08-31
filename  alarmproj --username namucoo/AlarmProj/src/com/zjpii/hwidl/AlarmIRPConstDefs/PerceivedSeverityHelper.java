package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/PerceivedSeverityHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the levels of severity.
   */
abstract public class PerceivedSeverityHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/PerceivedSeverity:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.PerceivedSeverity that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.PerceivedSeverity extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AlarmIRPConstDefs.PerceivedSeverityHelper.id (), "PerceivedSeverity");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.PerceivedSeverity read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PerceivedSeverityStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.PerceivedSeverity value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AlarmIRPConstDefs.PerceivedSeverity narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.PerceivedSeverity)
      return (AlarmIRPConstDefs.PerceivedSeverity)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._PerceivedSeverityStub stub = new AlarmIRPConstDefs._PerceivedSeverityStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AlarmIRPConstDefs.PerceivedSeverity unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.PerceivedSeverity)
      return (AlarmIRPConstDefs.PerceivedSeverity)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._PerceivedSeverityStub stub = new AlarmIRPConstDefs._PerceivedSeverityStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
