package CosNotifyComm;


/**
* CosNotifyComm/SequencePushSupplierHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// SequencePullSupplier
abstract public class SequencePushSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/SequencePushSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyComm.SequencePushSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyComm.SequencePushSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyComm.SequencePushSupplierHelper.id (), "SequencePushSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyComm.SequencePushSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_SequencePushSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyComm.SequencePushSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyComm.SequencePushSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.SequencePushSupplier)
      return (CosNotifyComm.SequencePushSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._SequencePushSupplierStub stub = new CosNotifyComm._SequencePushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyComm.SequencePushSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.SequencePushSupplier)
      return (CosNotifyComm.SequencePushSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._SequencePushSupplierStub stub = new CosNotifyComm._SequencePushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
