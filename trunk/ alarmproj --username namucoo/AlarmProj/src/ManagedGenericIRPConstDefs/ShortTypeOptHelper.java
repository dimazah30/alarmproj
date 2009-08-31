package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/ShortTypeOptHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分25秒 CST
*/

abstract public class ShortTypeOptHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPConstDefs/ShortTypeOpt:1.0";

  public static void insert (org.omg.CORBA.Any a, ManagedGenericIRPConstDefs.ShortTypeOpt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ManagedGenericIRPConstDefs.ShortTypeOpt extract (org.omg.CORBA.Any a)
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
      _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
      _members0[0] = new org.omg.CORBA.UnionMember (
        "value",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (ManagedGenericIRPConstDefs.ShortTypeOptHelper.id (), "ShortTypeOpt", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ManagedGenericIRPConstDefs.ShortTypeOpt read (org.omg.CORBA.portable.InputStream istream)
  {
    ManagedGenericIRPConstDefs.ShortTypeOpt value = new ManagedGenericIRPConstDefs.ShortTypeOpt ();
    boolean _dis0 = false;
    _dis0 = istream.read_boolean ();
    if (_dis0)
    {
      short _value = (short)0;
      _value = istream.read_short ();
      value.value (_dis0, _value);
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ManagedGenericIRPConstDefs.ShortTypeOpt value)
  {
    ostream.write_boolean (value.discriminator ());
    if (value.discriminator ())
    {
      ostream.write_short (value.value ());
    }
    else
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

}
