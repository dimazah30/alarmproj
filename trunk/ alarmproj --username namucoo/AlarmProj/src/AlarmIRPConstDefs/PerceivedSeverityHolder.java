package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/PerceivedSeverityHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the levels of severity.
   */
public final class PerceivedSeverityHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.PerceivedSeverity value = null;

  public PerceivedSeverityHolder ()
  {
  }

  public PerceivedSeverityHolder (AlarmIRPConstDefs.PerceivedSeverity initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.PerceivedSeverityHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.PerceivedSeverityHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.PerceivedSeverityHelper.type ();
  }

}
