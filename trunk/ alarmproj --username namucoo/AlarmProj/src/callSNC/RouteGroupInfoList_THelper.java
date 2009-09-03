package callSNC;


/**
* callSNC/RouteGroupInfoList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/** <p>
   * This structure provides a list of SNCs/Connections and associated
   * route group labels. </p>
   * 
   **/
abstract public class RouteGroupInfoList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/RouteGroupInfoList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.RouteGroupInfo_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.RouteGroupInfo_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = callSNC.RouteGroupInfo_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.RouteGroupInfoList_THelper.id (), "RouteGroupInfoList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static callSNC.RouteGroupInfo_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.RouteGroupInfo_T value[] = null;
    int _len0 = istream.read_long ();
    value = new callSNC.RouteGroupInfo_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = callSNC.RouteGroupInfo_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.RouteGroupInfo_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      callSNC.RouteGroupInfo_THelper.write (ostream, value[_i0]);
  }

}
