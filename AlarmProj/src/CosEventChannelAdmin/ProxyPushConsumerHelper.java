package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPushConsumerHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年8月26日 星期三 上午10时45分20秒 CST
*/

abstract public class ProxyPushConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosEventChannelAdmin.ProxyPushConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosEventChannelAdmin.ProxyPushConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosEventChannelAdmin.ProxyPushConsumerHelper.id (), "ProxyPushConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosEventChannelAdmin.ProxyPushConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ProxyPushConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosEventChannelAdmin.ProxyPushConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosEventChannelAdmin.ProxyPushConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventChannelAdmin.ProxyPushConsumer)
      return (CosEventChannelAdmin.ProxyPushConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventChannelAdmin._ProxyPushConsumerStub stub = new CosEventChannelAdmin._ProxyPushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosEventChannelAdmin.ProxyPushConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventChannelAdmin.ProxyPushConsumer)
      return (CosEventChannelAdmin.ProxyPushConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventChannelAdmin._ProxyPushConsumerStub stub = new CosEventChannelAdmin._ProxyPushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
