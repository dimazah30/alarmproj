package CosNotifyComm;


/**
* CosNotifyComm/SequencePushConsumerHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPushSupplier
abstract public class SequencePushConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/SequencePushConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyComm.SequencePushConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyComm.SequencePushConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyComm.SequencePushConsumerHelper.id (), "SequencePushConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyComm.SequencePushConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_SequencePushConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyComm.SequencePushConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyComm.SequencePushConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.SequencePushConsumer)
      return (CosNotifyComm.SequencePushConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._SequencePushConsumerStub stub = new CosNotifyComm._SequencePushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyComm.SequencePushConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.SequencePushConsumer)
      return (CosNotifyComm.SequencePushConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._SequencePushConsumerStub stub = new CosNotifyComm._SequencePushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
