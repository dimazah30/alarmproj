package CosNotifyComm;


/**
* CosNotifyComm/StructuredPullConsumerHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// StructuredPushConsumer
abstract public class StructuredPullConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/StructuredPullConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyComm.StructuredPullConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyComm.StructuredPullConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyComm.StructuredPullConsumerHelper.id (), "StructuredPullConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyComm.StructuredPullConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StructuredPullConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyComm.StructuredPullConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyComm.StructuredPullConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.StructuredPullConsumer)
      return (CosNotifyComm.StructuredPullConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._StructuredPullConsumerStub stub = new CosNotifyComm._StructuredPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyComm.StructuredPullConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.StructuredPullConsumer)
      return (CosNotifyComm.StructuredPullConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._StructuredPullConsumerStub stub = new CosNotifyComm._StructuredPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
