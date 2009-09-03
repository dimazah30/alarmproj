package notifications;


/**
* notifications/AlarmId_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
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
