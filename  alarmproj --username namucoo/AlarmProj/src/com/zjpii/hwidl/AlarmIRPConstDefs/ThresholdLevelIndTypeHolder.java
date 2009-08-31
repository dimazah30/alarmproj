package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/ThresholdLevelIndTypeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

public final class ThresholdLevelIndTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.ThresholdLevelIndType value = null;

  public ThresholdLevelIndTypeHolder ()
  {
  }

  public ThresholdLevelIndTypeHolder (AlarmIRPConstDefs.ThresholdLevelIndType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.ThresholdLevelIndTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.ThresholdLevelIndTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.ThresholdLevelIndTypeHelper.type ();
  }

}
