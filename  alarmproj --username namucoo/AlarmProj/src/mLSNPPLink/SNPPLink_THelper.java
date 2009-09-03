package mLSNPPLink;


/**
* mLSNPPLink/SNPPLink_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

abstract public class SNPPLink_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPPLink/SNPPLink_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPPLink.SNPPLink_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPPLink.SNPPLink_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "SNPPLinkId",
            _tcOf_members0,
            null);
          _tcOf_members0 = mLSNPP.SNPP_THelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "aEnd",
            _tcOf_members0,
            null);
          _tcOf_members0 = mLSNPP.SNPP_THelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "zEnd",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (mLSNPPLink.SNPPLink_THelper.id (), "SNPPLink_T", _members0);
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

  public static mLSNPPLink.SNPPLink_T read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPPLink.SNPPLink_T value = new mLSNPPLink.SNPPLink_T ();
    value.SNPPLinkId = istream.read_string ();
    value.aEnd = mLSNPP.SNPP_THelper.read (istream);
    value.zEnd = mLSNPP.SNPP_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPPLink.SNPPLink_T value)
  {
    ostream.write_string (value.SNPPLinkId);
    mLSNPP.SNPP_THelper.write (ostream, value.aEnd);
    mLSNPP.SNPP_THelper.write (ostream, value.zEnd);
  }

}
