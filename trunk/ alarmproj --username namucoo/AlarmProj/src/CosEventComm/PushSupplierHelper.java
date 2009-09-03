package CosEventComm;


/**
* CosEventComm/PushSupplierHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年9月2日 星期三 下午02时45分10秒 CST
*/


/**
    * Interface for a push supplier.
    */
abstract public class PushSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosEventComm/PushSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosEventComm.PushSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosEventComm.PushSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosEventComm.PushSupplierHelper.id (), "PushSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosEventComm.PushSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PushSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosEventComm.PushSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosEventComm.PushSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PushSupplier)
      return (CosEventComm.PushSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PushSupplierStub stub = new CosEventComm._PushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosEventComm.PushSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEventComm.PushSupplier)
      return (CosEventComm.PushSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEventComm._PushSupplierStub stub = new CosEventComm._PushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
