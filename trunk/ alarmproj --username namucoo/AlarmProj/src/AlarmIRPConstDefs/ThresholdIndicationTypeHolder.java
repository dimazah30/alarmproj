package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/ThresholdIndicationTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   It indicates if the threshold crossed was in the up or down direction.
   */
public final class ThresholdIndicationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.ThresholdIndicationType value = null;

  public ThresholdIndicationTypeHolder ()
  {
  }

  public ThresholdIndicationTypeHolder (AlarmIRPConstDefs.ThresholdIndicationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.ThresholdIndicationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.ThresholdIndicationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.ThresholdIndicationTypeHelper.type ();
  }

}
