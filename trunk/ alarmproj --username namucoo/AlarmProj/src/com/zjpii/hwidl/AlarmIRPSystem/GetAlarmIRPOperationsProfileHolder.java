package AlarmIRPSystem;

/**
* AlarmIRPSystem/GetAlarmIRPOperationsProfileHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmIRPOperationsProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.GetAlarmIRPOperationsProfile value = null;

  public GetAlarmIRPOperationsProfileHolder ()
  {
  }

  public GetAlarmIRPOperationsProfileHolder (AlarmIRPSystem.GetAlarmIRPOperationsProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.GetAlarmIRPOperationsProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.GetAlarmIRPOperationsProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.GetAlarmIRPOperationsProfileHelper.type ();
  }

}
