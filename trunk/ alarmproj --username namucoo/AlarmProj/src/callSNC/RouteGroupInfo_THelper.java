package callSNC;


/**
* callSNC/RouteGroupInfo_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

abstract public class RouteGroupInfo_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/RouteGroupInfo_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.RouteGroupInfo_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.RouteGroupInfo_T extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "sNCname",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "routeGroupLabel",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (callSNC.RouteGroupInfo_THelper.id (), "RouteGroupInfo_T", _members0);
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

  public static callSNC.RouteGroupInfo_T read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.RouteGroupInfo_T value = new callSNC.RouteGroupInfo_T ();
    value.sNCname = globaldefs.NVSList_THelper.read (istream);
    value.routeGroupLabel = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.RouteGroupInfo_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.sNCname);
    ostream.write_string (value.routeGroupLabel);
  }

}
