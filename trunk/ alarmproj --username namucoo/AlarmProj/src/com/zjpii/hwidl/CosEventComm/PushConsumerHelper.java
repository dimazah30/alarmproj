package CosEventComm;


/**
* CosEventComm/PushConsumerHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��8��26�� ������ ����10ʱ45��55�� CST
*/

abstract public class PushConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosEventComm/PushConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosEventComm.PushConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosEventComm.PushConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosEventComm.PushConsumerHelper.id (), "PushConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosEventComm.PushConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PushConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosEventComm.PushConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosEventComm.PushConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PushConsumer)
      return (CosEventComm.PushConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PushConsumerStub stub = new CosEventComm._PushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosEventComm.PushConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PushConsumer)
      return (CosEventComm.PushConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PushConsumerStub stub = new CosEventComm._PushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
