package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/ProbableCauseHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the probable cause of a reported alarm.
   */
public final class ProbableCauseHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.ProbableCause value = null;

  public ProbableCauseHolder ()
  {
  }

  public ProbableCauseHolder (AlarmIRPConstDefs.ProbableCause initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.ProbableCauseHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.ProbableCauseHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.ProbableCauseHelper.type ();
  }

}
