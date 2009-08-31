package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/ThresholdIndicationTypeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates if the threshold crossed was in the up or down direction.
   */
public final class ThresholdIndicationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.ThresholdIndicationType value = null;

  public ThresholdIndicationTypeHolder ()
  {
  }

  public ThresholdIndicationTypeHolder (AlarmIRPConstDefs.ThresholdIndicationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.ThresholdIndicationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.ThresholdIndicationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.ThresholdIndicationTypeHelper.type ();
  }

}
