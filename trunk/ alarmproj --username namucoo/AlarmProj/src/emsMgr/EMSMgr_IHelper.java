package emsMgr;


/**
* emsMgr/EMSMgr_IHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 emsMgr.idl
* 2009年9月2日 星期三 下午12时51分25秒 CST
*/


/**
   * <p>The EMSMgr_I is used to gain access to operations
   * which deal with the EMS itself.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in managerInterface when 
   * the managerName "EMS" is used.</p>
   **/
abstract public class EMSMgr_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0";

  public static void insert (org.omg.CORBA.Any a, emsMgr.EMSMgr_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static emsMgr.EMSMgr_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (emsMgr.EMSMgr_IHelper.id (), "EMSMgr_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static emsMgr.EMSMgr_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EMSMgr_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, emsMgr.EMSMgr_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static emsMgr.EMSMgr_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof emsMgr.EMSMgr_I)
      return (emsMgr.EMSMgr_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      emsMgr._EMSMgr_IStub stub = new emsMgr._EMSMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static emsMgr.EMSMgr_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof emsMgr.EMSMgr_I)
      return (emsMgr.EMSMgr_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      emsMgr._EMSMgr_IStub stub = new emsMgr._EMSMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
