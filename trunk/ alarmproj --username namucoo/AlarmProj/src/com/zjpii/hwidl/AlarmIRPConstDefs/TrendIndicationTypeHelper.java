package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/TrendIndicationTypeHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   It indicates if some observed condition is getting better, worse,
   or not changing.
   */
abstract public class TrendIndicationTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/TrendIndicationType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.TrendIndicationType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.TrendIndicationType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (AlarmIRPConstDefs.TrendIndicationTypeHelper.id (), "TrendIndicationType", new String[] { "LessSevere", "NoChange", "MoreSevere"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.TrendIndicationType read (org.omg.CORBA.portable.InputStream istream)
  {
    return AlarmIRPConstDefs.TrendIndicationType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.TrendIndicationType value)
  {
    ostream.write_long (value.value ());
  }

}
