package AlarmIRPSystem;

/**
* AlarmIRPSystem/GetAlarmCountHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmCountHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.GetAlarmCount value = null;

  public GetAlarmCountHolder ()
  {
  }

  public GetAlarmCountHolder (AlarmIRPSystem.GetAlarmCount initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.GetAlarmCountHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.GetAlarmCountHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.GetAlarmCountHelper.type ();
  }

}
