package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/ThresholdLevelIndTypeOptHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class ThresholdLevelIndTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.ThresholdLevelIndTypeOpt value = null;

  public ThresholdLevelIndTypeOptHolder ()
  {
  }

  public ThresholdLevelIndTypeOptHolder (AlarmIRPConstDefs.ThresholdLevelIndTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.ThresholdLevelIndTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.ThresholdLevelIndTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.ThresholdLevelIndTypeOptHelper.type ();
  }

}
