package CosNotification;


/**
* CosNotification/QoSAdminHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/


// MaxEventsPerConsumer takes on a value of type long
abstract public class QoSAdminHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/QoSAdmin:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.QoSAdmin that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.QoSAdmin extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotification.QoSAdminHelper.id (), "QoSAdmin");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.QoSAdmin read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_QoSAdminStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.QoSAdmin value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotification.QoSAdmin narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotification.QoSAdmin)
      return (CosNotification.QoSAdmin)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotification._QoSAdminStub stub = new CosNotification._QoSAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotification.QoSAdmin unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotification.QoSAdmin)
      return (CosNotification.QoSAdmin)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotification._QoSAdminStub stub = new CosNotification._QoSAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
