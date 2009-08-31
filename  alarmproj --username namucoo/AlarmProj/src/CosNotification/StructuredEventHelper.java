package CosNotification;


/**
* CosNotification/StructuredEventHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

abstract public class StructuredEventHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/StructuredEvent:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.StructuredEvent that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.StructuredEvent extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = CosNotification.EventHeaderHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "header",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosNotification.PropertyHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.PropertySeqHelper.id (), "PropertySeq", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.FilterableEventBodyHelper.id (), "FilterableEventBody", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "filterable_data",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_any);
          _members0[2] = new org.omg.CORBA.StructMember (
            "remainder_of_body",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosNotification.StructuredEventHelper.id (), "StructuredEvent", _members0);
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

  public static CosNotification.StructuredEvent read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotification.StructuredEvent value = new CosNotification.StructuredEvent ();
    value.header = CosNotification.EventHeaderHelper.read (istream);
    value.filterable_data = CosNotification.PropertySeqHelper.read (istream);
    value.remainder_of_body = istream.read_any ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.StructuredEvent value)
  {
    CosNotification.EventHeaderHelper.write (ostream, value.header);
    CosNotification.PropertySeqHelper.write (ostream, value.filterable_data);
    ostream.write_any (value.remainder_of_body);
  }

}
