package AlarmIRPSystem;

/**
* AlarmIRPSystem/NextAlarmInformationsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class NextAlarmInformationsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.NextAlarmInformations value = null;

  public NextAlarmInformationsHolder ()
  {
  }

  public NextAlarmInformationsHolder (AlarmIRPSystem.NextAlarmInformations initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.NextAlarmInformationsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.NextAlarmInformationsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.NextAlarmInformationsHelper.type ();
  }

}
