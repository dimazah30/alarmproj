package CosNaming;


/**
* CosNaming/BindingHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

abstract public class BindingHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/Binding:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNaming.Binding that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNaming.Binding extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = CosNaming.NameComponentHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNaming.NameHelper.id (), "Name", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "binding_name",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosNaming.BindingTypeHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "binding_type",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosNaming.BindingHelper.id (), "Binding", _members0);
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

  public static CosNaming.Binding read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNaming.Binding value = new CosNaming.Binding ();
    value.binding_name = CosNaming.NameHelper.read (istream);
    value.binding_type = CosNaming.BindingTypeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNaming.Binding value)
  {
    CosNaming.NameHelper.write (ostream, value.binding_name);
    CosNaming.BindingTypeHelper.write (ostream, value.binding_type);
  }

}
