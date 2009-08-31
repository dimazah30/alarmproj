package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/AttributeNameValueHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��11�� CST
*/


/*
   Define the parameters (in the notification header) specified in
   the Notification IRP: IS.
   */
abstract public class AttributeNameValueHelper
{
  private static String  _id = "IDL:3gppsa5.org/NotificationIRPConstDefs/AttributeNameValue:1.0";

  public static void insert (org.omg.CORBA.Any a, NotificationIRPConstDefs.AttributeNameValue that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NotificationIRPConstDefs.AttributeNameValue extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (NotificationIRPConstDefs.AttributeNameValueHelper.id (), "AttributeNameValue");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NotificationIRPConstDefs.AttributeNameValue read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AttributeNameValueStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NotificationIRPConstDefs.AttributeNameValue value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static NotificationIRPConstDefs.AttributeNameValue narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotificationIRPConstDefs.AttributeNameValue)
      return (NotificationIRPConstDefs.AttributeNameValue)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NotificationIRPConstDefs._AttributeNameValueStub stub = new NotificationIRPConstDefs._AttributeNameValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static NotificationIRPConstDefs.AttributeNameValue unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotificationIRPConstDefs.AttributeNameValue)
      return (NotificationIRPConstDefs.AttributeNameValue)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NotificationIRPConstDefs._AttributeNameValueStub stub = new NotificationIRPConstDefs._AttributeNameValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
