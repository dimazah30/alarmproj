package CosNotifyComm;


/**
* CosNotifyComm/PushSupplierHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// PullSupplier
abstract public class PushSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/PushSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyComm.PushSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyComm.PushSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyComm.PushSupplierHelper.id (), "PushSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyComm.PushSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PushSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyComm.PushSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyComm.PushSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.PushSupplier)
      return (CosNotifyComm.PushSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._PushSupplierStub stub = new CosNotifyComm._PushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyComm.PushSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.PushSupplier)
      return (CosNotifyComm.PushSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._PushSupplierStub stub = new CosNotifyComm._PushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
