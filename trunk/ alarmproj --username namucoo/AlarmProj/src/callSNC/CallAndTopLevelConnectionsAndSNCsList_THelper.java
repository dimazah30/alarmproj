package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCsList_THelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/


/** 
   * This structure represents a list of calls, their supporting top level
   * connections and the SNCs that support each top level connection.</p>
   * 
   **/
abstract public class CallAndTopLevelConnectionsAndSNCsList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnectionsAndSNCsList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.CallAndTopLevelConnectionsAndSNCs_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.CallAndTopLevelConnectionsAndSNCs_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.id (), "CallAndTopLevelConnectionsAndSNCsList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static callSNC.CallAndTopLevelConnectionsAndSNCs_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    callSNC.CallAndTopLevelConnectionsAndSNCs_T value[] = null;
    int _len0 = istream.read_long ();
    value = new callSNC.CallAndTopLevelConnectionsAndSNCs_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.CallAndTopLevelConnectionsAndSNCs_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write (ostream, value[_i0]);
  }

}
