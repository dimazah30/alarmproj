package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/BadAcknowledgeAlarmInfoSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class BadAcknowledgeAlarmInfoSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.BadAcknowledgeAlarmInfo value[] = null;

  public BadAcknowledgeAlarmInfoSeqHolder ()
  {
  }

  public BadAcknowledgeAlarmInfoSeqHolder (AlarmIRPConstDefs.BadAcknowledgeAlarmInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.BadAcknowledgeAlarmInfoSeqHelper.type ();
  }

}
