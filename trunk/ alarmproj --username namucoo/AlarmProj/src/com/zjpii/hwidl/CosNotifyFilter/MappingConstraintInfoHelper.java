package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintInfoHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

abstract public class MappingConstraintInfoHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/MappingConstraintInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyFilter.MappingConstraintInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyFilter.MappingConstraintInfo extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = CosNotifyFilter.ConstraintExpHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "constraint_expression",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotifyFilter.ConstraintIDHelper.id (), "ConstraintID", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "constraint_id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_any);
          _members0[2] = new org.omg.CORBA.StructMember (
            "value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosNotifyFilter.MappingConstraintInfoHelper.id (), "MappingConstraintInfo", _members0);
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

  public static CosNotifyFilter.MappingConstraintInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotifyFilter.MappingConstraintInfo value = new CosNotifyFilter.MappingConstraintInfo ();
    value.constraint_expression = CosNotifyFilter.ConstraintExpHelper.read (istream);
    value.constraint_id = istream.read_long ();
    value.value = istream.read_any ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyFilter.MappingConstraintInfo value)
  {
    CosNotifyFilter.ConstraintExpHelper.write (ostream, value.constraint_expression);
    ostream.write_long (value.constraint_id);
    ostream.write_any (value.value);
  }

}
