package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationIdAndSevSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   Define set of the above structure of Alarm ID and Perceived Severity.
   */
public final class AlarmInformationIdAndSevSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AlarmInformationIdAndSev value[] = null;

  public AlarmInformationIdAndSevSeqHolder ()
  {
  }

  public AlarmInformationIdAndSevSeqHolder (AlarmIRPConstDefs.AlarmInformationIdAndSev[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.type ();
  }

}
