package AlarmIRPSystem;

/**
* AlarmIRPSystem/GetAlarmCountHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class GetAlarmCountHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.GetAlarmCount value = null;

  public GetAlarmCountHolder ()
  {
  }

  public GetAlarmCountHolder (AlarmIRPSystem.GetAlarmCount initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.GetAlarmCountHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.GetAlarmCountHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.GetAlarmCountHelper.type ();
  }

}
