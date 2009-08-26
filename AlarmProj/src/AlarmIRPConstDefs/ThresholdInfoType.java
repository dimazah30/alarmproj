package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdInfoType.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class ThresholdInfoType implements org.omg.CORBA.portable.IDLEntity
{
  public String attributeID = null;
  public float observedValue = (float)0;
  public AlarmIRPConstDefs.ThresholdLevelIndTypeOpt thresholdLevel = null;
  public String armTime = null;

  public ThresholdInfoType ()
  {
  } // ctor

  public ThresholdInfoType (String _attributeID, float _observedValue, AlarmIRPConstDefs.ThresholdLevelIndTypeOpt _thresholdLevel, String _armTime)
  {
    attributeID = _attributeID;
    observedValue = _observedValue;
    thresholdLevel = _thresholdLevel;
    armTime = _armTime;
  } // ctor

} // class ThresholdInfoType
