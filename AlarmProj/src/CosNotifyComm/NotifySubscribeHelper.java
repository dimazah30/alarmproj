package CosNotifyComm;


/**
* CosNotifyComm/NotifySubscribeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// NotifyPublish
abstract public class NotifySubscribeHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyComm.NotifySubscribe that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyComm.NotifySubscribe extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyComm.NotifySubscribeHelper.id (), "NotifySubscribe");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyComm.NotifySubscribe read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NotifySubscribeStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyComm.NotifySubscribe value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyComm.NotifySubscribe narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.NotifySubscribe)
      return (CosNotifyComm.NotifySubscribe)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._NotifySubscribeStub stub = new CosNotifyComm._NotifySubscribeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyComm.NotifySubscribe unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.NotifySubscribe)
      return (CosNotifyComm.NotifySubscribe)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._NotifySubscribeStub stub = new CosNotifyComm._NotifySubscribeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
