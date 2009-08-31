package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmListAlignmentRequirementTypeHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   It indicates if the AlarmList alignment is required.
   */
abstract public class AlarmListAlignmentRequirementTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AlarmListAlignmentRequirementType:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPConstDefs.AlarmListAlignmentRequirementType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPConstDefs.AlarmListAlignmentRequirementType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (AlarmIRPConstDefs.AlarmListAlignmentRequirementTypeHelper.id (), "AlarmListAlignmentRequirementType", new String[] { "Required", "NotRequired"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPConstDefs.AlarmListAlignmentRequirementType read (org.omg.CORBA.portable.InputStream istream)
  {
    return AlarmIRPConstDefs.AlarmListAlignmentRequirementType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPConstDefs.AlarmListAlignmentRequirementType value)
  {
    ostream.write_long (value.value ());
  }

}
