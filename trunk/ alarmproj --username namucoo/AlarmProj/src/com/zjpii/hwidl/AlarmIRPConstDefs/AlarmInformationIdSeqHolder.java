package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationIdSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AlarmInformationIdSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public AlarmInformationIdSeqHolder ()
  {
  }

  public AlarmInformationIdSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AlarmInformationIdSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AlarmInformationIdSeqHelper.type ();
  }

}
