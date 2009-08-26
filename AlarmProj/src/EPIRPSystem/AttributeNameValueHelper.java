package EPIRPSystem;


/**
* EPIRPSystem/AttributeNameValueHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/


/*
  Define the parameters specified in
  the notifyEpInfoChanges notification.
  */
abstract public class AttributeNameValueHelper
{
  private static String  _id = "IDL:3gppsa5.org/EPIRPSystem/AttributeNameValue:1.0";

  public static void insert (org.omg.CORBA.Any a, EPIRPSystem.AttributeNameValue that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EPIRPSystem.AttributeNameValue extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (EPIRPSystem.AttributeNameValueHelper.id (), "AttributeNameValue");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EPIRPSystem.AttributeNameValue read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AttributeNameValueStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EPIRPSystem.AttributeNameValue value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static EPIRPSystem.AttributeNameValue narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof EPIRPSystem.AttributeNameValue)
      return (EPIRPSystem.AttributeNameValue)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      EPIRPSystem._AttributeNameValueStub stub = new EPIRPSystem._AttributeNameValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static EPIRPSystem.AttributeNameValue unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof EPIRPSystem.AttributeNameValue)
      return (EPIRPSystem.AttributeNameValue)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      EPIRPSystem._AttributeNameValueStub stub = new EPIRPSystem._AttributeNameValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
