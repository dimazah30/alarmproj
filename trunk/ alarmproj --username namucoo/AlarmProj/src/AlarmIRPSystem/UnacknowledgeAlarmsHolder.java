package AlarmIRPSystem;

/**
* AlarmIRPSystem/UnacknowledgeAlarmsHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/

public final class UnacknowledgeAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.UnacknowledgeAlarms value = null;

  public UnacknowledgeAlarmsHolder ()
  {
  }

  public UnacknowledgeAlarmsHolder (AlarmIRPSystem.UnacknowledgeAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.UnacknowledgeAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.UnacknowledgeAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.UnacknowledgeAlarmsHelper.type ();
  }

}
