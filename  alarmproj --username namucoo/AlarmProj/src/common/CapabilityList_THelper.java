package common;


/**
* common/CapabilityList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 common.idl
* 2009年9月2日 星期三 下午12时53分05秒 CST
*/


/**
   * Set of Capability_T.  Used to represent the full set of capabilities of a 
   * manager. Any capability that is not listed is considered unsupported.
   */
abstract public class CapabilityList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/common/CapabilityList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, globaldefs.NameAndStringValue_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static globaldefs.NameAndStringValue_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = globaldefs.NameAndStringValue_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (common.Capability_THelper.id (), "Capability_T", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (common.CapabilityList_THelper.id (), "CapabilityList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static globaldefs.NameAndStringValue_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    globaldefs.NameAndStringValue_T value[] = null;
    int _len0 = istream.read_long ();
    value = new globaldefs.NameAndStringValue_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = common.Capability_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, globaldefs.NameAndStringValue_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      common.Capability_THelper.write (ostream, value[_i0]);
  }

}
