package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/ProbableCauseHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the probable cause of a reported alarm.
   */
public final class ProbableCauseHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.ProbableCause value = null;

  public ProbableCauseHolder ()
  {
  }

  public ProbableCauseHolder (AlarmIRPConstDefs.ProbableCause initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.ProbableCauseHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.ProbableCauseHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.ProbableCauseHelper.type ();
  }

}
