package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdLevelIndType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

public final class ThresholdLevelIndType implements org.omg.CORBA.portable.IDLEntity
{
  public AlarmIRPConstDefs.ThresholdIndicationType indication = null;
  public AlarmIRPConstDefs.FloatTypeOpt low = null;
  public float high = (float)0;

  public ThresholdLevelIndType ()
  {
  } // ctor

  public ThresholdLevelIndType (AlarmIRPConstDefs.ThresholdIndicationType _indication, AlarmIRPConstDefs.FloatTypeOpt _low, float _high)
  {
    indication = _indication;
    low = _low;
    high = _high;
  } // ctor

} // class ThresholdLevelIndType
