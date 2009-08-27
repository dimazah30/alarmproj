package CosEventComm;


/**
* CosEventComm/PullSupplierHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年8月26日 星期三 上午10时45分55秒 CST
*/

abstract public class PullSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosEventComm/PullSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosEventComm.PullSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosEventComm.PullSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosEventComm.PullSupplierHelper.id (), "PullSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosEventComm.PullSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PullSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosEventComm.PullSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosEventComm.PullSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PullSupplier)
      return (CosEventComm.PullSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PullSupplierStub stub = new CosEventComm._PullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosEventComm.PullSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PullSupplier)
      return (CosEventComm.PullSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PullSupplierStub stub = new CosEventComm._PullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
