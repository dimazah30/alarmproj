package notifications;


/**
* notifications/TCAId_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/

public final class TCAId_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T objectName[] = null;
  public short layerRate = (short)0;
  public String pmParameterName = null;
  public String pmLocation = null;
  public String granularity = null;

  public TCAId_T ()
  {
  } // ctor

  public TCAId_T (globaldefs.NameAndStringValue_T[] _objectName, short _layerRate, String _pmParameterName, String _pmLocation, String _granularity)
  {
    objectName = _objectName;
    layerRate = _layerRate;
    pmParameterName = _pmParameterName;
    pmLocation = _pmLocation;
    granularity = _granularity;
  } // ctor

} // class TCAId_T
