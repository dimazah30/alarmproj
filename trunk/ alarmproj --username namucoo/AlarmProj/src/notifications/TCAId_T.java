package notifications;


/**
* notifications/TCAId_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
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
