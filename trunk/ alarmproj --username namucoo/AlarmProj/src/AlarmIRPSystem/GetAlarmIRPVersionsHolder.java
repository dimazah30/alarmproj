package AlarmIRPSystem;

/**
* AlarmIRPSystem/GetAlarmIRPVersionsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmIRPVersionsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.GetAlarmIRPVersions value = null;

  public GetAlarmIRPVersionsHolder ()
  {
  }

  public GetAlarmIRPVersionsHolder (AlarmIRPSystem.GetAlarmIRPVersions initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.GetAlarmIRPVersionsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.GetAlarmIRPVersionsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.GetAlarmIRPVersionsHelper.type ();
  }

}
