package AlarmIRPSystem;

/**
* AlarmIRPSystem/ClearAlarmsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class ClearAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.ClearAlarms value = null;

  public ClearAlarmsHolder ()
  {
  }

  public ClearAlarmsHolder (AlarmIRPSystem.ClearAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.ClearAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.ClearAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.ClearAlarmsHelper.type ();
  }

}
