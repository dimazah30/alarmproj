package CosEventComm;


/**
* CosEventComm/PullConsumerHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��9��2�� ������ ����02ʱ45��10�� CST
*/


/**
    * Interface for a pull consumer.
    */
abstract public class PullConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosEventComm/PullConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosEventComm.PullConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosEventComm.PullConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosEventComm.PullConsumerHelper.id (), "PullConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosEventComm.PullConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PullConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosEventComm.PullConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosEventComm.PullConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PullConsumer)
      return (CosEventComm.PullConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PullConsumerStub stub = new CosEventComm._PullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosEventComm.PullConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PullConsumer)
      return (CosEventComm.PullConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PullConsumerStub stub = new CosEventComm._PullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
