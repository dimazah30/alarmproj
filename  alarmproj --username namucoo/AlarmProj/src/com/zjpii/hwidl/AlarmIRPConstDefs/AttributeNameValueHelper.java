package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeNameValueHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies attributes which are included as part of the Alarm IRP
   These attribute values should not clash with those defined for the attributes
   of notification header (see IDL of Notification IRP).
   */
abstract public class AttributeNameValueHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AttributeNameValue:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.AttributeNameValue that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.AttributeNameValue extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AlarmIRPConstDefs.AttributeNameValueHelper.id (), "AttributeNameValue");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.AttributeNameValue read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AttributeNameValueStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.AttributeNameValue value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AlarmIRPConstDefs.AttributeNameValue narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.AttributeNameValue)
      return (AlarmIRPConstDefs.AttributeNameValue)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._AttributeNameValueStub stub = new AlarmIRPConstDefs._AttributeNameValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AlarmIRPConstDefs.AttributeNameValue unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPConstDefs.AttributeNameValue)
      return (AlarmIRPConstDefs.AttributeNameValue)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPConstDefs._AttributeNameValueStub stub = new AlarmIRPConstDefs._AttributeNameValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
