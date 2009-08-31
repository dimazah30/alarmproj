package NotificationIRPSystem;


/**
* NotificationIRPSystem/NotificationIRPHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPSystem.idl
* 2009年8月31日 星期一 下午09时50分30秒 CST
*/

abstract public class NotificationIRPHelper
{
  private static String  _id = "IDL:3gppsa5.org/NotificationIRPSystem/NotificationIRP:1.0";

  public static void insert (org.omg.CORBA.Any a, NotificationIRPSystem.NotificationIRP that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NotificationIRPSystem.NotificationIRP extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (NotificationIRPSystem.NotificationIRPHelper.id (), "NotificationIRP");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NotificationIRPSystem.NotificationIRP read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NotificationIRPStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NotificationIRPSystem.NotificationIRP value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static NotificationIRPSystem.NotificationIRP narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotificationIRPSystem.NotificationIRP)
      return (NotificationIRPSystem.NotificationIRP)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NotificationIRPSystem._NotificationIRPStub stub = new NotificationIRPSystem._NotificationIRPStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static NotificationIRPSystem.NotificationIRP unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotificationIRPSystem.NotificationIRP)
      return (NotificationIRPSystem.NotificationIRP)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NotificationIRPSystem._NotificationIRPStub stub = new NotificationIRPSystem._NotificationIRPStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
