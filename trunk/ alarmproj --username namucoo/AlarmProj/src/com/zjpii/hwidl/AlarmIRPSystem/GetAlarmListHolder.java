package AlarmIRPSystem;

/**
* AlarmIRPSystem/GetAlarmListHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmListHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.GetAlarmList value = null;

  public GetAlarmListHolder ()
  {
  }

  public GetAlarmListHolder (AlarmIRPSystem.GetAlarmList initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.GetAlarmListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.GetAlarmListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.GetAlarmListHelper.type ();
  }

}
