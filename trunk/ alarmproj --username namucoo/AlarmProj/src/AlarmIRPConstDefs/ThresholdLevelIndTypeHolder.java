package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/ThresholdLevelIndTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class ThresholdLevelIndTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.ThresholdLevelIndType value = null;

  public ThresholdLevelIndTypeHolder ()
  {
  }

  public ThresholdLevelIndTypeHolder (AlarmIRPConstDefs.ThresholdLevelIndType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.ThresholdLevelIndTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.ThresholdLevelIndTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.ThresholdLevelIndTypeHelper.type ();
  }

}
