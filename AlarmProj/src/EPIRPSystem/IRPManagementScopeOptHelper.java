package EPIRPSystem;


/**
* EPIRPSystem/IRPManagementScopeOptHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

abstract public class IRPManagementScopeOptHelper
{
  private static String  _id = "IDL:3gppsa5.org/EPIRPSystem/IRPManagementScopeOpt:1.0";

  public static void insert (org.omg.CORBA.Any a, EPIRPSystem.IRPManagementScopeOpt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EPIRPSystem.IRPManagementScopeOpt extract (org.omg.CORBA.Any a)
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
      _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
      _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (EPIRPSystem.DNListTypeHelper.id (), "DNListType", _tcOf_members0);
      _members0[0] = new org.omg.CORBA.UnionMember (
        "value",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (EPIRPSystem.IRPManagementScopeOptHelper.id (), "IRPManagementScopeOpt", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EPIRPSystem.IRPManagementScopeOpt read (org.omg.CORBA.portable.InputStream istream)
  {
    EPIRPSystem.IRPManagementScopeOpt value = new EPIRPSystem.IRPManagementScopeOpt ();
    boolean _dis0 = false;
    _dis0 = istream.read_boolean ();
    if (_dis0)
    {
      String _value[] = null;
      _value = EPIRPSystem.DNListTypeHelper.read (istream);
      value.value (_dis0, _value);
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EPIRPSystem.IRPManagementScopeOpt value)
  {
    ostream.write_boolean (value.discriminator ());
    if (value.discriminator ())
    {
      EPIRPSystem.DNListTypeHelper.write (ostream, value.value ());
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

}
