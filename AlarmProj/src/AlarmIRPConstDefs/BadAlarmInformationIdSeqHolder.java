package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/BadAlarmInformationIdSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class BadAlarmInformationIdSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.BadAlarmInformationId value[] = null;

  public BadAlarmInformationIdSeqHolder ()
  {
  }

  public BadAlarmInformationIdSeqHolder (AlarmIRPConstDefs.BadAlarmInformationId[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.BadAlarmInformationIdSeqHelper.type ();
  }

}
