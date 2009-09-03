package mLSNPPLink;


/**
* mLSNPPLink/MLSNPPLinkMgr_IHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/


/**
   * <p>The mLSNPPLinkMgr_I is used to gain access to MLSNPP Links and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
abstract public class MLSNPPLinkMgr_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPPLink/MLSNPPLinkMgr_I:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPPLink.MLSNPPLinkMgr_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPPLink.MLSNPPLinkMgr_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (mLSNPPLink.MLSNPPLinkMgr_IHelper.id (), "MLSNPPLinkMgr_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mLSNPPLink.MLSNPPLinkMgr_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MLSNPPLinkMgr_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPPLink.MLSNPPLinkMgr_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static mLSNPPLink.MLSNPPLinkMgr_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof mLSNPPLink.MLSNPPLinkMgr_I)
      return (mLSNPPLink.MLSNPPLinkMgr_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      mLSNPPLink._MLSNPPLinkMgr_IStub stub = new mLSNPPLink._MLSNPPLinkMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static mLSNPPLink.MLSNPPLinkMgr_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof mLSNPPLink.MLSNPPLinkMgr_I)
      return (mLSNPPLink.MLSNPPLinkMgr_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      mLSNPPLink._MLSNPPLinkMgr_IStub stub = new mLSNPPLink._MLSNPPLinkMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
