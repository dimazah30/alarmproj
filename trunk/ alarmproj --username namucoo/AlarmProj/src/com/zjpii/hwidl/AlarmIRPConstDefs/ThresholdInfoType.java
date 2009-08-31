package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdInfoType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
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
