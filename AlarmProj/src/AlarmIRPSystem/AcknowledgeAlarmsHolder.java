package AlarmIRPSystem;

/**
* AlarmIRPSystem/AcknowledgeAlarmsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class AcknowledgeAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.AcknowledgeAlarms value = null;

  public AcknowledgeAlarmsHolder ()
  {
  }

  public AcknowledgeAlarmsHolder (AlarmIRPSystem.AcknowledgeAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.AcknowledgeAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.AcknowledgeAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.AcknowledgeAlarmsHelper.type ();
  }

}
