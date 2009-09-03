package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/MultiLayerSubnetworkMgr_IHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * <p>The multiLayerSubnetworkMgr_I is used to gain access to subnetworks and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
abstract public class MultiLayerSubnetworkMgr_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0";

  public static void insert (org.omg.CORBA.Any a, multiLayerSubnetwork.MultiLayerSubnetworkMgr_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static multiLayerSubnetwork.MultiLayerSubnetworkMgr_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.id (), "MultiLayerSubnetworkMgr_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static multiLayerSubnetwork.MultiLayerSubnetworkMgr_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MultiLayerSubnetworkMgr_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, multiLayerSubnetwork.MultiLayerSubnetworkMgr_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static multiLayerSubnetwork.MultiLayerSubnetworkMgr_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof multiLayerSubnetwork.MultiLayerSubnetworkMgr_I)
      return (multiLayerSubnetwork.MultiLayerSubnetworkMgr_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      multiLayerSubnetwork._MultiLayerSubnetworkMgr_IStub stub = new multiLayerSubnetwork._MultiLayerSubnetworkMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static multiLayerSubnetwork.MultiLayerSubnetworkMgr_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof multiLayerSubnetwork.MultiLayerSubnetworkMgr_I)
      return (multiLayerSubnetwork.MultiLayerSubnetworkMgr_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      multiLayerSubnetwork._MultiLayerSubnetworkMgr_IStub stub = new multiLayerSubnetwork._MultiLayerSubnetworkMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
