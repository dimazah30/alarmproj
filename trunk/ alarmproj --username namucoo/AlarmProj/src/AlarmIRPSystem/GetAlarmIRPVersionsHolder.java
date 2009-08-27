package AlarmIRPSystem;

/**
* AlarmIRPSystem/GetAlarmIRPVersionsHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class GetAlarmIRPVersionsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.GetAlarmIRPVersions value = null;

  public GetAlarmIRPVersionsHolder ()
  {
  }

  public GetAlarmIRPVersionsHolder (AlarmIRPSystem.GetAlarmIRPVersions initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.GetAlarmIRPVersionsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.GetAlarmIRPVersionsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.GetAlarmIRPVersionsHelper.type ();
  }

}
