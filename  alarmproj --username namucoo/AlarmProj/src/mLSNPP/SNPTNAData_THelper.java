package mLSNPP;


/**
* mLSNPP/SNPTNAData_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

abstract public class SNPTNAData_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPP/SNPTNAData_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPP.SNPTNAData_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPP.SNPTNAData_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "sNPPId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "layerRate",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "rAId",
            _tcOf_members0,
            null);
          _tcOf_members0 = mLSNPP.SNPTNAPair_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPP.SNPTNAPairList_THelper.id (), "SNPTNAPairList_T", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "sNPTNAPairList",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (mLSNPP.SNPTNAData_THelper.id (), "SNPTNAData_T", _members0);
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

  public static mLSNPP.SNPTNAData_T read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPP.SNPTNAData_T value = new mLSNPP.SNPTNAData_T ();
    value.sNPPId = istream.read_string ();
    value.layerRate = istream.read_short ();
    value.rAId = istream.read_string ();
    value.sNPTNAPairList = mLSNPP.SNPTNAPairList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPP.SNPTNAData_T value)
  {
    ostream.write_string (value.sNPPId);
    ostream.write_short (value.layerRate);
    ostream.write_string (value.rAId);
    mLSNPP.SNPTNAPairList_THelper.write (ostream, value.sNPTNAPairList);
  }

}
