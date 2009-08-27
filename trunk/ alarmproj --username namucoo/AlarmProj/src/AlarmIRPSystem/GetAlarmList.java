package AlarmIRPSystem;


/**
* AlarmIRPSystem/GetAlarmList.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class GetAlarmList extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetAlarmList ()
  {
    super(GetAlarmListHelper.id());
  } // ctor

  public GetAlarmList (String _reason)
  {
    super(GetAlarmListHelper.id());
    reason = _reason;
  } // ctor


  public GetAlarmList (String $reason, String _reason)
  {
    super(GetAlarmListHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetAlarmList
