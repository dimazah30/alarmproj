package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AckStateHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the acknowledgement state of a reported alarm.
   */
public final class AckStateHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AckState value = null;

  public AckStateHolder ()
  {
  }

  public AckStateHolder (AlarmIRPConstDefs.AckState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AckStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AckStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AckStateHelper.type ();
  }

}
