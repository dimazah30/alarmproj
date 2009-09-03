package mLSNPPLink;


/**
* mLSNPPLink/MLSNPPLinkIterator_IHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
abstract public class MLSNPPLinkIterator_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPPLink/MLSNPPLinkIterator_I:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPPLink.MLSNPPLinkIterator_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPPLink.MLSNPPLinkIterator_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (mLSNPPLink.MLSNPPLinkIterator_IHelper.id (), "MLSNPPLinkIterator_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mLSNPPLink.MLSNPPLinkIterator_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MLSNPPLinkIterator_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPPLink.MLSNPPLinkIterator_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static mLSNPPLink.MLSNPPLinkIterator_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof mLSNPPLink.MLSNPPLinkIterator_I)
      return (mLSNPPLink.MLSNPPLinkIterator_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      mLSNPPLink._MLSNPPLinkIterator_IStub stub = new mLSNPPLink._MLSNPPLinkIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static mLSNPPLink.MLSNPPLinkIterator_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof mLSNPPLink.MLSNPPLinkIterator_I)
      return (mLSNPPLink.MLSNPPLinkIterator_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      mLSNPPLink._MLSNPPLinkIterator_IStub stub = new mLSNPPLink._MLSNPPLinkIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
