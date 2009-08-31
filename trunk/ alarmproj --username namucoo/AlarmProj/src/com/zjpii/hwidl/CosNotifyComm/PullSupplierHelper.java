package CosNotifyComm;


/**
* CosNotifyComm/PullSupplierHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// PullConsumer
abstract public class PullSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/PullSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyComm.PullSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyComm.PullSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyComm.PullSupplierHelper.id (), "PullSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyComm.PullSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PullSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyComm.PullSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyComm.PullSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.PullSupplier)
      return (CosNotifyComm.PullSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._PullSupplierStub stub = new CosNotifyComm._PullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyComm.PullSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.PullSupplier)
      return (CosNotifyComm.PullSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._PullSupplierStub stub = new CosNotifyComm._PullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
