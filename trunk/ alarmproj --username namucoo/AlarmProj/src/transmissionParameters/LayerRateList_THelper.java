package transmissionParameters;


/**
* transmissionParameters/LayerRateList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 transmissionParameters.idl
* 2009年9月2日 星期三 下午03时27分33秒 CST
*/


/**
   * <p>Set of LayerRate_T.<p>
   **/
abstract public class LayerRateList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/transmissionParameters/LayerRateList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, short[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static short[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRateList_THelper.id (), "LayerRateList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static short[] read (org.omg.CORBA.portable.InputStream istream)
  {
    short value[] = null;
    int _len0 = istream.read_long ();
    value = new short[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = transmissionParameters.LayerRate_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, short[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      transmissionParameters.LayerRate_THelper.write (ostream, value[_i0]);
  }

}
