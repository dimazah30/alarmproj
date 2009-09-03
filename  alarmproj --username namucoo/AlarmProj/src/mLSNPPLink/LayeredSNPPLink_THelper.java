package mLSNPPLink;


/**
* mLSNPPLink/LayeredSNPPLink_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

abstract public class LayeredSNPPLink_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPPLink/LayeredSNPPLink_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPPLink.LayeredSNPPLink_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPPLink.LayeredSNPPLink_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "layerRate",
            _tcOf_members0,
            null);
          _tcOf_members0 = mLSNPPLink.SNPPLink_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPPLink.SNPPLinkList_THelper.id (), "SNPPLinkList_T", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "sNPPLinkList",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (mLSNPPLink.LayeredSNPPLink_THelper.id (), "LayeredSNPPLink_T", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mLSNPPLink.LayeredSNPPLink_T read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPPLink.LayeredSNPPLink_T value = new mLSNPPLink.LayeredSNPPLink_T ();
    value.layerRate = istream.read_short ();
    value.sNPPLinkList = mLSNPPLink.SNPPLinkList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPPLink.LayeredSNPPLink_T value)
  {
    ostream.write_short (value.layerRate);
    mLSNPPLink.SNPPLinkList_THelper.write (ostream, value.sNPPLinkList);
  }

}
