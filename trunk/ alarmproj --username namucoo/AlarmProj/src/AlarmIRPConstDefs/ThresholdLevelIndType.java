package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ThresholdLevelIndType.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
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
