package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmCount.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmCount extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmCount ()
  {
    super(GetAlarmCountHelper.id());
  } // ctor

  public GetAlarmCount (String _reason)
  {
    super(GetAlarmCountHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmCount (String $reason, String _reason)
  {
    super(GetAlarmCountHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmCount
