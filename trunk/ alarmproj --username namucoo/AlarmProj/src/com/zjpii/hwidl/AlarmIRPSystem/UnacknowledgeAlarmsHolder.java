package AlarmIRPSystem;

/**
* AlarmIRPSystem/UnacknowledgeAlarmsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class UnacknowledgeAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.UnacknowledgeAlarms value = null;

  public UnacknowledgeAlarmsHolder ()
  {
  }

  public UnacknowledgeAlarmsHolder (AlarmIRPSystem.UnacknowledgeAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.UnacknowledgeAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.UnacknowledgeAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.UnacknowledgeAlarmsHelper.type ();
  }

}
