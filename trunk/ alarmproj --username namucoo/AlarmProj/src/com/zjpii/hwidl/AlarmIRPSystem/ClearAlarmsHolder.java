package AlarmIRPSystem;

/**
* AlarmIRPSystem/ClearAlarmsHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class ClearAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.ClearAlarms value = null;

  public ClearAlarmsHolder ()
  {
  }

  public ClearAlarmsHolder (AlarmIRPSystem.ClearAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.ClearAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.ClearAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.ClearAlarmsHelper.type ();
  }

}
