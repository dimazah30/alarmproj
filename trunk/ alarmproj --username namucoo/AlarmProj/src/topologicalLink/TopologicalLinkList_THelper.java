package topologicalLink;


/**
* topologicalLink/TopologicalLinkList_THelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� topologicalLink.idl
* 2009��9��2�� ������ ����03ʱ27��49�� CST
*/


/**
   * <p>Sequence of TopologicalLink_T.<p>
   **/
abstract public class TopologicalLinkList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/topologicalLink/TopologicalLinkList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, topologicalLink.TopologicalLink_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static topologicalLink.TopologicalLink_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = topologicalLink.TopologicalLink_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (topologicalLink.TopologicalLinkList_THelper.id (), "TopologicalLinkList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static topologicalLink.TopologicalLink_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    topologicalLink.TopologicalLink_T value[] = null;
    int _len0 = istream.read_long ();
    value = new topologicalLink.TopologicalLink_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = topologicalLink.TopologicalLink_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, topologicalLink.TopologicalLink_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      topologicalLink.TopologicalLink_THelper.write (ostream, value[_i0]);
  }

}
