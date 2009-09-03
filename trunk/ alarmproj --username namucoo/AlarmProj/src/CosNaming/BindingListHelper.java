package CosNaming;


/**
* CosNaming/BindingListHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

abstract public class BindingListHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/BindingList:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNaming.Binding[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNaming.Binding[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = CosNaming.BindingHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNaming.BindingListHelper.id (), "BindingList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNaming.Binding[] read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNaming.Binding value[] = null;
    int _len0 = istream.read_long ();
    value = new CosNaming.Binding[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = CosNaming.BindingHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNaming.Binding[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      CosNaming.BindingHelper.write (ostream, value[_i0]);
  }

}
