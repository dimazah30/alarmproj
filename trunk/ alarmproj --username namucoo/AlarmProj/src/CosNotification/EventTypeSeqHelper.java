package CosNotification;


/**
* CosNotification/EventTypeSeqHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

abstract public class EventTypeSeqHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/EventTypeSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.EventType[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.EventType[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = CosNotification.EventTypeHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.EventTypeSeqHelper.id (), "EventTypeSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.EventType[] read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotification.EventType value[] = null;
    int _len0 = istream.read_long ();
    value = new CosNotification.EventType[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = CosNotification.EventTypeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.EventType[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      CosNotification.EventTypeHelper.write (ostream, value[_i0]);
  }

}
