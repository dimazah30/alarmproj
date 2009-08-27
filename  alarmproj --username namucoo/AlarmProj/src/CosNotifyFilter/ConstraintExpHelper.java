package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintExpHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

abstract public class ConstraintExpHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/ConstraintExp:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyFilter.ConstraintExp that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyFilter.ConstraintExp extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = CosNotification.EventTypeHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.EventTypeSeqHelper.id (), "EventTypeSeq", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "event_types",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "constraint_expr",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosNotifyFilter.ConstraintExpHelper.id (), "ConstraintExp", _members0);
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

  public static CosNotifyFilter.ConstraintExp read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotifyFilter.ConstraintExp value = new CosNotifyFilter.ConstraintExp ();
    value.event_types = CosNotification.EventTypeSeqHelper.read (istream);
    value.constraint_expr = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyFilter.ConstraintExp value)
  {
    CosNotification.EventTypeSeqHelper.write (ostream, value.event_types);
    ostream.write_string (value.constraint_expr);
  }

}
