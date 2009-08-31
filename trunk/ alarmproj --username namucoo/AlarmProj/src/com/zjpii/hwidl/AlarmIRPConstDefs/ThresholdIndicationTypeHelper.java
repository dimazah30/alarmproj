package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdIndicationTypeHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   It indicates if the threshold crossed was in the up or down direction.
   */
abstract public class ThresholdIndicationTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/ThresholdIndicationType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.ThresholdIndicationType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.ThresholdIndicationType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (AlarmIRPConstDefs.ThresholdIndicationTypeHelper.id (), "ThresholdIndicationType", new String[] { "Up", "Down"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.ThresholdIndicationType read (org.omg.CORBA.portable.InputStream istream)
  {
    return AlarmIRPConstDefs.ThresholdIndicationType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.ThresholdIndicationType value)
  {
    ostream.write_long (value.value ());
  }

}
