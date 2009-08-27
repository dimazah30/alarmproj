package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AlarmListAlignmentRequirementTypeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
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
