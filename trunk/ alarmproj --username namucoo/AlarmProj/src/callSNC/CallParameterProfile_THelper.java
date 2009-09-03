package callSNC;


/**
* callSNC/CallParameterProfile_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

abstract public class CallParameterProfile_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/CallParameterProfile_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.CallParameterProfile_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.CallParameterProfile_T extract (org.omg.CORBA.Any a)
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
            "severelyDegradedThreshold",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "degradedTreshold",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "classOfService",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "classOfServiceParameters",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (callSNC.CallParameterProfile_THelper.id (), "CallParameterProfile_T", _members0);
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

  public static callSNC.CallParameterProfile_T read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.CallParameterProfile_T value = new callSNC.CallParameterProfile_T ();
    value.severelyDegradedThreshold = istream.read_string ();
    value.degradedTreshold = istream.read_string ();
    value.classOfService = istream.read_string ();
    value.classOfServiceParameters = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.CallParameterProfile_T value)
  {
    ostream.write_string (value.severelyDegradedThreshold);
    ostream.write_string (value.degradedTreshold);
    ostream.write_string (value.classOfService);
    globaldefs.NVSList_THelper.write (ostream, value.classOfServiceParameters);
  }

}
