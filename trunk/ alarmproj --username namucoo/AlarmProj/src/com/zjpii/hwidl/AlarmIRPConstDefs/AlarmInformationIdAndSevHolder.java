package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AlarmInformationIdAndSevHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AlarmInformationIdAndSevHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AlarmInformationIdAndSev value = null;

  public AlarmInformationIdAndSevHolder ()
  {
  }

  public AlarmInformationIdAndSevHolder (AlarmIRPConstDefs.AlarmInformationIdAndSev initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AlarmInformationIdAndSevHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AlarmInformationIdAndSevHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AlarmInformationIdAndSevHelper.type ();
  }

}
