package CosNotifyFilter;


/**
* CosNotifyFilter/MappingFilterHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/


// Filter
abstract public class MappingFilterHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/MappingFilter:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyFilter.MappingFilter that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyFilter.MappingFilter extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyFilter.MappingFilterHelper.id (), "MappingFilter");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyFilter.MappingFilter read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MappingFilterStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyFilter.MappingFilter value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyFilter.MappingFilter narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyFilter.MappingFilter)
      return (CosNotifyFilter.MappingFilter)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyFilter._MappingFilterStub stub = new CosNotifyFilter._MappingFilterStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyFilter.MappingFilter unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyFilter.MappingFilter)
      return (CosNotifyFilter.MappingFilter)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyFilter._MappingFilterStub stub = new CosNotifyFilter._MappingFilterStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
