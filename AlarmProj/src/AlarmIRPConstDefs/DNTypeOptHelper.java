package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/DNTypeOptHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

abstract public class DNTypeOptHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/DNTypeOpt:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.DNTypeOpt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.DNTypeOpt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      org.omg.CORBA.TypeCode _disTypeCode0;
      _disTypeCode0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
      org.omg.CORBA.UnionMember[] _members0 = new org.omg.CORBA.UnionMember [1];
      org.omg.CORBA.TypeCode _tcOf_members0;
      org.omg.CORBA.Any _anyOf_members0;

      // Branch for value (case label true)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      _anyOf_members0.insert_boolean ((boolean)true);
      _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
      _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (AlarmIRPConstDefs.DNHelper.id (), "DN", _tcOf_members0);
      _members0[0] = new org.omg.CORBA.UnionMember (
        "value",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (AlarmIRPConstDefs.DNTypeOptHelper.id (), "DNTypeOpt", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.DNTypeOpt read (org.omg.CORBA.portable.InputStream istream)
  {
    AlarmIRPConstDefs.DNTypeOpt value = new AlarmIRPConstDefs.DNTypeOpt ();
    boolean _dis0 = false;
    _dis0 = istream.read_boolean ();
    if (_dis0)
    {
      String _value = null;
      _value = AlarmIRPConstDefs.DNHelper.read (istream);
      value.value (_dis0, _value);
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.DNTypeOpt value)
  {
    ostream.write_boolean (value.discriminator ());
    if (value.discriminator ())
    {
      AlarmIRPConstDefs.DNHelper.write (ostream, value.value ());
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

}
