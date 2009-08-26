package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeChangeSetTypeHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

abstract public class AttributeChangeSetTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AttributeChangeSetType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.AttributeValueChangeType[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.AttributeValueChangeType[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = AlarmIRPConstDefs.AttributeValueChangeTypeHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (AlarmIRPConstDefs.AttributeChangeSetTypeHelper.id (), "AttributeChangeSetType", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.AttributeValueChangeType[] read (org.omg.CORBA.portable.InputStream istream)
  {
    AlarmIRPConstDefs.AttributeValueChangeType value[] = null;
    int _len0 = istream.read_long ();
    value = new AlarmIRPConstDefs.AttributeValueChangeType[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = AlarmIRPConstDefs.AttributeValueChangeTypeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.AttributeValueChangeType[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      AlarmIRPConstDefs.AttributeValueChangeTypeHelper.write (ostream, value[_i0]);
  }

}
