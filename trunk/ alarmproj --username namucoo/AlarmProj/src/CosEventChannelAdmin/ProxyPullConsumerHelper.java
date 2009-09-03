package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ProxyPullConsumerHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
*/


/**
    * Interface for a proxy pull consumer.
    */
abstract public class ProxyPullConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosEventChannelAdmin.ProxyPullConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosEventChannelAdmin.ProxyPullConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosEventChannelAdmin.ProxyPullConsumerHelper.id (), "ProxyPullConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosEventChannelAdmin.ProxyPullConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ProxyPullConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosEventChannelAdmin.ProxyPullConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosEventChannelAdmin.ProxyPullConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventChannelAdmin.ProxyPullConsumer)
      return (CosEventChannelAdmin.ProxyPullConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventChannelAdmin._ProxyPullConsumerStub stub = new CosEventChannelAdmin._ProxyPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosEventChannelAdmin.ProxyPullConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventChannelAdmin.ProxyPullConsumer)
      return (CosEventChannelAdmin.ProxyPullConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventChannelAdmin._ProxyPullConsumerStub stub = new CosEventChannelAdmin._ProxyPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
