package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/BadAcknowledgeAlarmInfoHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class BadAcknowledgeAlarmInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.BadAcknowledgeAlarmInfo value = null;

  public BadAcknowledgeAlarmInfoHolder ()
  {
  }

  public BadAcknowledgeAlarmInfoHolder (AlarmIRPConstDefs.BadAcknowledgeAlarmInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.BadAcknowledgeAlarmInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.BadAcknowledgeAlarmInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.BadAcknowledgeAlarmInfoHelper.type ();
  }

}
