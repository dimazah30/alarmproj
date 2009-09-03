package callSNC;


/**
* callSNC/SharedResourceList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/**
   * A list of the resources being shared by a list of connections 
   **/
abstract public class SharedResourceList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/SharedResourceList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.SharedResource_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.SharedResource_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = callSNC.SharedResource_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.SharedResourceList_THelper.id (), "SharedResourceList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static callSNC.SharedResource_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.SharedResource_T value[] = null;
    int _len0 = istream.read_long ();
    value = new callSNC.SharedResource_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = callSNC.SharedResource_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.SharedResource_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      callSNC.SharedResource_THelper.write (ostream, value[_i0]);
  }

}
