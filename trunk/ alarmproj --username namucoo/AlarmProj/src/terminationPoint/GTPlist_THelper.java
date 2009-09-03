package terminationPoint;


/**
* terminationPoint/GTPlist_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>Sequence of GTP_T.</p>
   **/
abstract public class GTPlist_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/GTPlist_T:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.GTP_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.GTP_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = terminationPoint.GTP_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (terminationPoint.GTPlist_THelper.id (), "GTPlist_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static terminationPoint.GTP_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    terminationPoint.GTP_T value[] = null;
    int _len0 = istream.read_long ();
    value = new terminationPoint.GTP_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = terminationPoint.GTP_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.GTP_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      terminationPoint.GTP_THelper.write (ostream, value[_i0]);
  }

}
