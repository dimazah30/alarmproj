package notifications;


/**
* notifications/AlarmId_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/

public final class AlarmId_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T objectName[] = null;
  public short layerRate = (short)0;
  public String probableCause = null;
  public String probableCauseQualifier = null;

  public AlarmId_T ()
  {
  } // ctor

  public AlarmId_T (globaldefs.NameAndStringValue_T[] _objectName, short _layerRate, String _probableCause, String _probableCauseQualifier)
  {
    objectName = _objectName;
    layerRate = _layerRate;
    probableCause = _probableCause;
    probableCauseQualifier = _probableCauseQualifier;
  } // ctor

} // class AlarmId_T
