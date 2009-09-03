package mLSNPPLink;


/**
* mLSNPPLink/SNPPLinkList_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/


/** 
   * The List of SNPPLink_T. It is a list of the SNPP Links across the levels of routing hierarchy. This shall always include the details for the SNPP Links in the relevant layer directly represented by the MLSNPPLink and may also include details for the subordinate SNPP Links if the information is available to the EMS. The routing level is identified via the Routing Area IDs of end SNPPs.
   **/
abstract public class SNPPLinkList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPPLink/SNPPLinkList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPPLink.SNPPLink_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPPLink.SNPPLink_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = mLSNPPLink.SNPPLink_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPPLink.SNPPLinkList_THelper.id (), "SNPPLinkList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mLSNPPLink.SNPPLink_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPPLink.SNPPLink_T value[] = null;
    int _len0 = istream.read_long ();
    value = new mLSNPPLink.SNPPLink_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = mLSNPPLink.SNPPLink_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPPLink.SNPPLink_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      mLSNPPLink.SNPPLink_THelper.write (ostream, value[_i0]);
  }

}
