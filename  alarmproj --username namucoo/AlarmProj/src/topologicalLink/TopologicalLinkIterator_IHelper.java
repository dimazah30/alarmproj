package topologicalLink;


/**
* topologicalLink/TopologicalLinkIterator_IHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 topologicalLink.idl
* 2009年9月2日 星期三 下午03时27分49秒 CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
abstract public class TopologicalLinkIterator_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/topologicalLink/TopologicalLinkIterator_I:1.0";

  public static void insert (org.omg.CORBA.Any a, topologicalLink.TopologicalLinkIterator_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static topologicalLink.TopologicalLinkIterator_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (topologicalLink.TopologicalLinkIterator_IHelper.id (), "TopologicalLinkIterator_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static topologicalLink.TopologicalLinkIterator_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TopologicalLinkIterator_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, topologicalLink.TopologicalLinkIterator_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static topologicalLink.TopologicalLinkIterator_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof topologicalLink.TopologicalLinkIterator_I)
      return (topologicalLink.TopologicalLinkIterator_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      topologicalLink._TopologicalLinkIterator_IStub stub = new topologicalLink._TopologicalLinkIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static topologicalLink.TopologicalLinkIterator_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof topologicalLink.TopologicalLinkIterator_I)
      return (topologicalLink.TopologicalLinkIterator_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      topologicalLink._TopologicalLinkIterator_IStub stub = new topologicalLink._TopologicalLinkIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
