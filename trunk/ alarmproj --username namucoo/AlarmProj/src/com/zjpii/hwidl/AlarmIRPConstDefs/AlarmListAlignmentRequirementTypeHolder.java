package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AlarmListAlignmentRequirementTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   It indicates if the AlarmList alignment is required.
   */
public final class AlarmListAlignmentRequirementTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AlarmListAlignmentRequirementType value = null;

  public AlarmListAlignmentRequirementTypeHolder ()
  {
  }

  public AlarmListAlignmentRequirementTypeHolder (AlarmIRPConstDefs.AlarmListAlignmentRequirementType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AlarmListAlignmentRequirementTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AlarmListAlignmentRequirementTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AlarmListAlignmentRequirementTypeHelper.type ();
  }

}
