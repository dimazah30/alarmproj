package callSNC;


/**
* callSNC/DiversityInfoList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/**
   * A list of the diversity types and their associated shared resources
   **/
abstract public class DiversityInfoList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/DiversityInfoList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.DiversityInfo_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.DiversityInfo_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = callSNC.DiversityInfo_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.DiversityInfoList_THelper.id (), "DiversityInfoList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static callSNC.DiversityInfo_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.DiversityInfo_T value[] = null;
    int _len0 = istream.read_long ();
    value = new callSNC.DiversityInfo_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = callSNC.DiversityInfo_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.DiversityInfo_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      callSNC.DiversityInfo_THelper.write (ostream, value[_i0]);
  }

}
