package mLSNPP;


/**
* mLSNPP/TNAName_THelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**
   * <p>This represents the TNA Name. It is an opaque logical name that does not
   * reflect the network structure that may be published externally to the network.
   * The value maybe substructured, it may include a sequence of TNA Name, TNA
   * Logical Port Identifier and Index, however there is no constraints placed
   * on the structure by the interface definition. 
   * </p>
   * 
   **/
abstract public class TNAName_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPP/TNAName_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPP.TNAName_THelper.id (), "TNAName_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_string (value);
  }

}
