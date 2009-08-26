package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintPairSeqHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

abstract public class MappingConstraintPairSeqHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/MappingConstraintPairSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyFilter.MappingConstraintPair[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyFilter.MappingConstraintPair[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = CosNotifyFilter.MappingConstraintPairHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotifyFilter.MappingConstraintPairSeqHelper.id (), "MappingConstraintPairSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyFilter.MappingConstraintPair[] read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotifyFilter.MappingConstraintPair value[] = null;
    int _len0 = istream.read_long ();
    value = new CosNotifyFilter.MappingConstraintPair[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = CosNotifyFilter.MappingConstraintPairHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyFilter.MappingConstraintPair[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      CosNotifyFilter.MappingConstraintPairHelper.write (ostream, value[_i0]);
  }

}
