package AlarmIRPSystem;

/**
* AlarmIRPSystem/GetAlarmIRPNotificationProfileHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmIRPNotificationProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.GetAlarmIRPNotificationProfile value = null;

  public GetAlarmIRPNotificationProfileHolder ()
  {
  }

  public GetAlarmIRPNotificationProfileHolder (AlarmIRPSystem.GetAlarmIRPNotificationProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.GetAlarmIRPNotificationProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.GetAlarmIRPNotificationProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.GetAlarmIRPNotificationProfileHelper.type ();
  }

}
