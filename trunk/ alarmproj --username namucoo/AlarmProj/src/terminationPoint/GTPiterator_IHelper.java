package terminationPoint;


/**
* terminationPoint/GTPiterator_IHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� terminationPoint.idl
* 2009��9��2�� ������ ����03ʱ27��55�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
abstract public class GTPiterator_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/GTPiterator_I:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.GTPiterator_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.GTPiterator_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (terminationPoint.GTPiterator_IHelper.id (), "GTPiterator_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static terminationPoint.GTPiterator_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GTPiterator_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.GTPiterator_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static terminationPoint.GTPiterator_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof terminationPoint.GTPiterator_I)
      return (terminationPoint.GTPiterator_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      terminationPoint._GTPiterator_IStub stub = new terminationPoint._GTPiterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static terminationPoint.GTPiterator_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof terminationPoint.GTPiterator_I)
      return (terminationPoint.GTPiterator_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      terminationPoint._GTPiterator_IStub stub = new terminationPoint._GTPiterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
