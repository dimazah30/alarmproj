package mLSNPP;


/**
* mLSNPP/SNPPList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/


/**
   * The List of SNPP_T. It is a list of the SNPPs across the levels of routing hierarchy. This shall always include the details for the SNPPs in the relevant layer directly represented by the MLSNPP and may also include details for the subordinate SNPPs if the information is available to the EMS. The routing level is identified via the Routing Area IDs.
   **/
abstract public class SNPPList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPP/SNPPList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPP.SNPP_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPP.SNPP_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = mLSNPP.SNPP_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPP.SNPPList_THelper.id (), "SNPPList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mLSNPP.SNPP_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPP.SNPP_T value[] = null;
    int _len0 = istream.read_long ();
    value = new mLSNPP.SNPP_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = mLSNPP.SNPP_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPP.SNPP_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      mLSNPP.SNPP_THelper.write (ostream, value[_i0]);
  }

}
