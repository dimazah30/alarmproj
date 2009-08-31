package CosNotification;


/**
* CosNotification/PropertyErrorHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

abstract public class PropertyErrorHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/PropertyError:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.PropertyError that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.PropertyError extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = CosNotification.QoSError_codeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "code",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.IstringHelper.id (), "Istring", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.PropertyNameHelper.id (), "PropertyName", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosNotification.PropertyRangeHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "available_range",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosNotification.PropertyErrorHelper.id (), "PropertyError", _members0);
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

  public static CosNotification.PropertyError read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotification.PropertyError value = new CosNotification.PropertyError ();
    value.code = CosNotification.QoSError_codeHelper.read (istream);
    value.name = istream.read_string ();
    value.available_range = CosNotification.PropertyRangeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.PropertyError value)
  {
    CosNotification.QoSError_codeHelper.write (ostream, value.code);
    ostream.write_string (value.name);
    CosNotification.PropertyRangeHelper.write (ostream, value.available_range);
  }

}
